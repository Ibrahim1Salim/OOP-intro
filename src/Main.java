import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (boolean createNewCar = true; createNewCar; ) {
            System.out.println("Avtomobil melumatlarin daxil edin:");
            System.out.print("Marka: ");
            String make = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Ili: ");
            int year = scanner.nextInt();

            Car car = new Car(make, model, year);
            System.out.println("Avtomobil melumatlari:");
            car.displayInfo();

            System.out.println("Yeni avtomobil yaratmaq isteyirsiniz? (1-beli / 2-xeyr)");
            int secim = scanner.nextInt();
            createNewCar = (secim == 1);
        }

    }
}

