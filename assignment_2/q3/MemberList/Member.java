package MemberList;

public class Member {
    private String name;
    private String dob;
    private int book_issued_count;
    private static final int MAX_ISSUED_BOOKS = 1;

    public Member(String name, String dob) {
        this.name = name;
        this.dob = dob;
        this.book_issued_count = 0;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public int getBook_issued_count() {
        return book_issued_count;
    }

    public void setBook_issued_count(int book_issued_count) throws Exception {
        if (book_issued_count > MAX_ISSUED_BOOKS)
            throw new Exception("Reached book limit! Can't issue more.");
        this.book_issued_count = book_issued_count;
    }

}
