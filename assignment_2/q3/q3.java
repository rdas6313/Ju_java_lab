
import Booklist.*;
import Transaction.*;
import MemberList.*;

public class q3 {
    public static void main(String[] args) {
        BookList books = new BookList(10);
        System.out.println("adding books.");
        Book book1 = new Book("Network", 3, 2);
        Book book2 = new Book("Os", 2, 2);
        int bookid1 = books.add(book1);
        int bookid2 = books.add(book2);

        MemberList members = new MemberList(10);
        System.out.println("Adding members.");
        Member member1 = new Member("Raja", "04/07.1994");
        Member member2 = new Member("Agni", "04/07/1995");
        int memid1 = members.add(member1);
        int memid2 = members.add(member2);

        System.out.println("Issue Book Transactions..");
        TransactionList transactions = new TransactionList(20, members, books);
        transactions.issueBook(memid1, bookid1);
        transactions.issueBook(memid1, bookid2);
        transactions.issueBook(memid2, bookid2);

        System.out.println("Return Book Transactions..");
        transactions.returnBook(memid1, bookid1);
        transactions.returnBook(memid2, bookid2);
    }
}
