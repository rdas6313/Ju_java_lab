package Transaction;

public class Entry {
    private int member_id;
    private int book_id;

    public Entry(int member_id, int book_id) {
        this.member_id = member_id;
        this.book_id = book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public int getBook_id() {
        return book_id;
    }

}
