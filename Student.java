package activity;
//Student.java
public class Student {
 private String name;
 private double[] marks;

 // Constructor, getters, and setters
 public Student(String name, double[] marks) {
     this.name = name;
     this.marks = marks;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public double[] getMarks() {
     return marks;
 }

 public void setMarks(double[] marks) {
     this.marks = marks;
 }
}
