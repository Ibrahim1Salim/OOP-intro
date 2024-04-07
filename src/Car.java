public class Car {
    private String make;
    private String model;
    private int year;
    private static int maxSpeedLimit = 120;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static int getMaxSpeedLimit() {
        return maxSpeedLimit;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

