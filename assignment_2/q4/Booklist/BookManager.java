package Booklist;

public interface BookManager {
    int add(Book book);

    Book search(int id);

    void viewAllBook();

    void viewBook(int id);
}
