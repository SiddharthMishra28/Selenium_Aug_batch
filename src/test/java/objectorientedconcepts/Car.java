package objectorientedconcepts;

public class Car {

    // member variables
    String make;
    String model;
    String color;
    String engineType;
    String seatCapacity;

    // constructor
    Car(String ma, String mo) {
        this.make = ma;
        this.model = mo;
        System.out.println("Car "+make+" "+model+" created!");
    }

    public void startCar() {
        System.out.println("Car : "+model+" Started!");
    }

    public static void main(String[] args) {
        Car santro = new Car("Hyundai", "Santro");
        santro.color = "Grey";
        santro.startCar();
    }
}
