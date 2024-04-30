package activity;
//MarksCalculator.java
public class MarksCalculator {
 public double calculateAverage(double[] marks) {
     double sum = 0;
     for (double mark : marks) {
         sum += mark;
     }
     return sum / marks.length;
 }
}

