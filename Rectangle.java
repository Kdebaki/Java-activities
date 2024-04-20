// Implement various real time entities as classes and objects.
package week2;
public class Rectangle {
  double length;
  double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        // Declare and initialize an object of the Rectangle class
        Rectangle myRectangle = new Rectangle(5, 3);

        // Accessing attributes
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());

        // Accessing methods
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
    }
}
