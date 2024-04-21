package Booklist;

public class BookList implements BookManager {
    private Book books[];
    private int index;

    public BookList(int size) {
        books = new Book[size];
        index = 0;
    }

    public int add(Book book) {
        if (index >= books.length)
            throw new ArrayIndexOutOfBoundsException("unable to add new books");
        books[index++] = book;
        System.out.println(book.getTitle() + " book added to Booklist");
        return index - 1;
    }

    public void addCopies(int id, int copies) {
        if (id >= index)
            throw new ArrayIndexOutOfBoundsException("Wrong id");
        Book book = books[id];
        book.setPurchased_copies(copies);
    }

    private void displayBook(int id) {
        if (id >= index)
            throw new ArrayIndexOutOfBoundsException("Wrong id");
        System.out.println("Title: " + books[id].getTitle());
        System.out.println("Purchased copies: " + books[id].getPurchased_copies());
        System.out.println("Available copies: " + books[id].getAvailable_copies());
    }

    private void displayAllBooks() {
        for (int i = 0; i < index; i++) {
            System.out.println("............");
            System.out.println("Book id: " + i);
            displayBook(i);
            System.out.println(".............");
        }
    }

    private Book getBook(int id) {
        if (id >= index)
            throw new ArrayIndexOutOfBoundsException("Wrong id");
        return books[id];
    }

    @Override
    public Book search(int id) {
        return getBook(id);
    }

    @Override
    public void viewAllBook() {
        displayAllBooks();
    }

    @Override
    public void viewBook(int id) {
        displayBook(id);
    }

}
