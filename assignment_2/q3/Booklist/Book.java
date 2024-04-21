package Booklist;

public class Book {
    private String title;
    private int purchased_copies;
    private int available_copies;

    public Book(String title, int purchased_copies, int available_copies) {
        this.title = title;
        this.purchased_copies = purchased_copies;
        this.available_copies = available_copies;
    }

    public String getTitle() {
        return title;
    }

    public int getPurchased_copies() {
        return purchased_copies;
    }

    public int getAvailable_copies() {
        return available_copies;
    }

    public void setPurchased_copies(int purchased_copies) {
        this.purchased_copies = purchased_copies;
    }

    public void setAvailable_copies(int available_copies) throws Exception {
        if (available_copies > this.purchased_copies)
            throw new Exception("Available copy can't be greater than purchased copy");
        this.available_copies = available_copies;
    }

}
