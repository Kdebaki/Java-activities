package activity;
//Employee.java
public class Employee {
private String name;
private int id;
private double hourlyRate;
private double hoursWorked;

// Constructor, getters, and setters
public Employee(String name, int id, double hourlyRate, double hoursWorked) {
   this.name = name;
   this.id = id;
   this.hourlyRate = hourlyRate;
   this.hoursWorked = hoursWorked;
}

// Getters and setters
public String getName() {
   return name;
}

public void setName(String name) {
   this.name = name;
}

public int getId() {
   return id;
}

public void setId(int id) {
   this.id = id;
}

public double getHourlyRate() {
   return hourlyRate;
}

public void setHourlyRate(double hourlyRate) {
   this.hourlyRate = hourlyRate;
}

public double getHoursWorked() {
   return hoursWorked;
}

public void setHoursWorked(double hoursWorked) {
   this.hoursWorked = hoursWorked;
}
}