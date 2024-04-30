package activity;

//Main.java
public class Main {
 public static void main(String[] args) {
     Employee employee = new Employee("John Doe", 101, 25.0, 40.0);

     PayrollCalculator payrollCalculator = new PayrollCalculator();
     double payrollAmount = payrollCalculator.calculatePayroll(employee);

     PayrollPrinter payrollPrinter = new PayrollPrinter();
     payrollPrinter.printPayroll(employee, payrollAmount);
 }
}
