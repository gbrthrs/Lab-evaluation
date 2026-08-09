abstract class Vehicle {

    String name;

    Vehicle(String name) {
        this.name = name;
    }

    abstract double fuelEfficiency();

    void displayInfo() {
        System.out.println("Vehicle: " + name);
        System.out.println("Fuel Efficiency: " + fuelEfficiency());
    }
}

class Car extends Vehicle {

    Car(String name) {
        super(name);
    }

    @Override
    double fuelEfficiency() {
        return 15.5;
    }
}

class Bike extends Vehicle {

    Bike(String name) {
        super(name);
    }

    @Override
    double fuelEfficiency() {
        return 45.0;
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota");
        Bike bike = new Bike("Yamaha");

        car.displayInfo();
        System.out.println();

        bike.displayInfo();
    }
}
