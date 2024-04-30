package activity;
//PayrollPrinter.java
public class PayrollPrinter {
public void printPayroll(Employee employee, double payrollAmount) {
   System.out.println("Employee Name: " + employee.getName());
   System.out.println("Employee ID: " + employee.getId());
   System.out.println("Payroll Amount: $" + payrollAmount);
}
}
