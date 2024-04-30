package activity;
//GradeDeterminer.java
public class GradeDeterminer {
 public String determineGrade(double averageMarks) {
     if (averageMarks >= 90) {
         return "A";
     } else if (averageMarks >= 80) {
         return "B";
     } else if (averageMarks >= 70) {
         return "C";
     } else if (averageMarks >= 60) {
         return "D";
     } else {
         return "F";
     }
 }
}
