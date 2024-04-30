package activity;
//Main.java
public class main2 {
 public static void main(String[] args) {
     double[] marks = {85, 90, 75, 80, 95};
     Student student = new Student("John Doe", marks);

     MarksCalculator marksCalculator = new MarksCalculator();
     double averageMarks = marksCalculator.calculateAverage(student.getMarks());

     GradeDeterminer gradeDeterminer = new GradeDeterminer();
     String grade = gradeDeterminer.determineGrade(averageMarks);

     System.out.println("Student Name: " + student.getName());
     System.out.println("Average Marks: " + averageMarks);
     System.out.println("Grade: " + grade);
 }
}
