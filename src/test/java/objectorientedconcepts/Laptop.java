package objectorientedconcepts;

public class Laptop {

    String brand;
    float screenSize;
    int ramCapacity;
    float processorCapacityInGhz;
    float batteryCapacity;
    String keyboardType;

    // Methods - Functions
    // Reusable code

    public void switchOnLaptop() throws InterruptedException {
        System.out.println("Switching on...");
        Thread.sleep(3000);
        System.out.println("Laptop "+brand+" switched on!");
    }

    public static void main(String[] args) throws InterruptedException {
        Laptop lenovoLaptop = new Laptop();
        // instantiates an object
        // reserves / allocates memory to store the object
        lenovoLaptop.brand = "lenovo";
        lenovoLaptop.screenSize = 14.5f;
        lenovoLaptop.ramCapacity = 8;
        lenovoLaptop.processorCapacityInGhz = 4.1f;
        lenovoLaptop.batteryCapacity = 9900f;
        lenovoLaptop.keyboardType = "US English";
        lenovoLaptop.switchOnLaptop();

        Laptop samsungLaptop = new Laptop();
        samsungLaptop.brand = "Samsung";
        samsungLaptop.switchOnLaptop();
        // FULLY QUALIFIED NAME
//        if() {
//            System.out.println("Match found!");
//        }
    }
}
