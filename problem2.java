import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double baseSalary = sc.nextDouble();
        double totalSales = sc.nextDouble();

        double commission = totalSales * 0.15;
        double totalPay = baseSalary + commission;

        System.out.printf("Total Pay: %.2f%n", totalPay);
        sc.close();

    }
}
