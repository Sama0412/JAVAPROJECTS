package java_practice_task1;

class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Constructor
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        setPrice(price); // हा method अस्तित्वात असावा
    }

    // Setter with validation
    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price cannot be negative.");
            this.price = 0; // default value
        }
    }

    // Getters
    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    // Display method
    public void display() {
        System.out.println("Book ID: " + bookId +
                           ", Title: " + title +
                           ", Author: " + author +
                           ", Price: " + price);
    }

    
}
