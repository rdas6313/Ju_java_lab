package Transaction;

public interface TransactionManager {
    void issueBook(int memId, int bookId);

    void returnBook(int memId, int bookId);
}
