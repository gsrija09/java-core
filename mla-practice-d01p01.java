package D01P01;

class Book {
    private String bookTitle;
    private double bookPrice;

    // Constructor
    public Book(String bookTitle, double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
    }

    // Getter and Setter methods
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}

public class D01P01 {
    // Method to create Book object
    public static Book createBooks(String title, double price) {
        return new Book(title, price);
    }

    // Method to show Book details
    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
    }

    public static void main(String[] args) {
        // Input
        String title = "Java Programming";
        double price = 350.00;

        // Creating Book object
        Book book = createBooks(title, price);

        // Showing Book details
        showBooks(book);
    }
}