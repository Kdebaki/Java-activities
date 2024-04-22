/**ACTIVITY-03
 * Design a Book class with attributes title, author, and publication year. Implement methods to retrieve and update these
attributes. Instantiate a Book object of class by using default constructor and demonstrate accessing its attributes and
methods. 
 */

package week3;
public class Book {
     String title;
     String author;
     int publicationYear;

    // Default constructor
    public Book() {
        // Default values
        this.title = "";
        this.author = "";
        this.publicationYear = 0;
    }

    // Getter and setter methods for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter methods for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and setter methods for publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args) {
        // Instantiate a Book object using the default constructor
        Book book1 = new Book();

        
        // attributes
        book1.setTitle("Java Programming");
        book1.setAuthor("James Gosling");
        book1.setPublicationYear(1996);

        // Accessing attributes again
        System.out.println("Title: " + book1.getTitle());  // Output: "Java Programming"
        System.out.println("Author: " + book1.getAuthor());  // Output: "James Gosling"
        System.out.println("Publication Year: " + book1.getPublicationYear());  // Output: 1996
    }
}

