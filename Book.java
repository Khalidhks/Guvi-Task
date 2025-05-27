public class Book {
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void displayBook() {
        System.out.println("ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}
