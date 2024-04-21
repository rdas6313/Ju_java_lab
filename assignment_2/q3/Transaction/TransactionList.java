package Transaction;

import Booklist.Book;
import Booklist.BookList;
import MemberList.Member;
import MemberList.MemberList;

public class TransactionList {
    private Entry list[];
    private int index;

    private MemberList members;
    private BookList books;

    public TransactionList(int size, MemberList members, BookList books) {
        list = new Entry[size];
        index = 0;
        this.members = members;
        this.books = books;
    }

    public void issueBook(int memId, int bookId) {
        if (index >= list.length)
            throw new ArrayIndexOutOfBoundsException("Transaction list full! Can't issue more");
        try {
            Member member = members.getMember(memId);
            Book book = books.getBook(bookId);
            if (book.getAvailable_copies() == 0)
                throw new Exception("Book not available");
            member.setBook_issued_count(member.getBook_issued_count() + 1);
            book.setAvailable_copies(book.getAvailable_copies() - 1);
            Entry entry = new Entry(memId, bookId);
            list[index++] = entry;
            System.out.println(book.getTitle() + " book issued to " + member.getName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void returnBook(int memId, int bookId) {
        try {
            Member member = members.getMember(memId);
            Book book = books.getBook(bookId);
            for (int i = 0; i < index; i++) {
                if (list[i].getBook_id() == bookId && list[i].getMember_id() == memId) {
                    int j = i + 1;
                    while (j < index) {
                        list[j - 1] = list[j];
                        j++;
                    }
                    index--;
                    member.setBook_issued_count(member.getBook_issued_count() - 1);
                    book.setAvailable_copies(book.getAvailable_copies() + 1);
                    System.out.println(book.getTitle() + " book returned by " + member.getName());
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
