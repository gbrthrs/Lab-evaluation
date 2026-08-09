import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        double bonusRate;

        if (salary <= 20000) {
            bonusRate = 0.15;
        } else if (salary <= 40000) {
            bonusRate = 0.10;
        } else if (salary <= 60000) {
            bonusRate = 0.07;
        } else {
            bonusRate = 0.04;
        }

        double increase = salary * bonusRate;
        double newSalary = salary + increase;

        System.out.printf("New Salary: %.2f%n", newSalary);
        System.out.printf("Increase: %.2f%n", increase);
    }
}
