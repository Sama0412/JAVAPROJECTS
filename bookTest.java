package java_practice_task1;

public class bookTest {
	public static void main(String[] args) {
        Book b1 = new Book(101, "Java Basics", "James Gosling", 500);
        Book b2 = new Book(102, "SQL Guide", "Codd", 350);
        Book b3 = new Book(103, "CSS Styling", "Håkon Lie", -200); // invalid price

        b1.display();
        b2.display();
        b3.display();
    }
}
