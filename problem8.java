import java.util.Scanner;

class InvalidDaysException extends Exception {
    public InvalidDaysException(String message) {
        super(message);
    }
}

interface Returnable {
    double returnItem(int daysLate) throws InvalidDaysException;
}

abstract class LibraryItem implements Returnable {

    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract double finePerDay();

    @Override
    public double returnItem(int daysLate) throws InvalidDaysException {
        if (daysLate < 0) {
            throw new InvalidDaysException(
                    "Error: daysLate cannot be negative"
            );
        }

        return finePerDay() * daysLate;
    }
}

class Book extends LibraryItem {

    Book(String title) {
        super(title);
    }

    @Override
    double finePerDay() {
        return 5.0;
    }
}

class DVD extends LibraryItem {

    DVD(String title) {
        super(title);
    }

    @Override
    double finePerDay() {
        return 10.0;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bookDays = sc.nextInt();
        int dvdDays = sc.nextInt();

        Book book = new Book("Book");
        DVD dvd = new DVD("DVD");

        try {
            double bookFine = book.returnItem(bookDays);
            System.out.printf("Book fine: %.2f%n", bookFine);
        } catch (InvalidDaysException e) {
            System.out.println(e.getMessage());
        }

        try {
            double dvdFine = dvd.returnItem(dvdDays);
            System.out.printf("DVD fine: %.2f%n", dvdFine);
        } catch (InvalidDaysException e) {
            System.out.println(e.getMessage());
        }
    }
}
