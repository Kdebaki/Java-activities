package activity;
//PayrollCalculator.java
public class PayrollCalculator {
public double calculatePayroll(Employee employee) {
   // Assume a simple calculation for the payroll, e.g., hourly rate * hours worked
   return employee.getHourlyRate() * employee.getHoursWorked();
}
}