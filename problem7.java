import java.util.Scanner;

class InvalidHoursException extends Exception {
    public InvalidHoursException(String message) {
        super(message);
    }
}

interface Payable {
    double calculateSalary(double hoursWorked, double rate)
            throws InvalidHoursException;
}

class RegularEmployee implements Payable {

    @Override
    public double calculateSalary(double hoursWorked, double rate)
            throws InvalidHoursException {

        if (hoursWorked < 0) {
            throw new InvalidHoursException(
                    "Error: Hours worked cannot be negative"
            );
        }

        return hoursWorked * rate;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double hoursWorked = sc.nextDouble();
        double rate = sc.nextDouble();

        RegularEmployee employee = new RegularEmployee();

        try {
            double salary = employee.calculateSalary(hoursWorked, rate);
            System.out.printf("Salary: %.2f%n", salary);
        } catch (InvalidHoursException e) {
            System.out.println(e.getMessage());
        }
    }
}
