import Classes.Auto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Auto newAuto = new Auto();

    Scanner input = new Scanner(System.in);

        System.out.println("Please enter max tank capacity:");
        int maxTankFullness = input.nextInt();
        input.nextLine();
        newAuto.setMaxTankFullness(maxTankFullness);

        System.out.println("Please enter how many liters are filled:");
        int tankFullness = input.nextInt();
        input.nextLine();
        newAuto.setTankFullness(tankFullness);

        System.out.println("Gasoline consumption per 100 km:");
        double fuelConsumption = input.nextDouble();
        input.nextLine();
        newAuto.setFuelConsumption(fuelConsumption);

        System.out.println("Date of last inspection (dd.mm.yyyy):");
        String dateString = input.nextLine();
        LocalDate dateInspection = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        newAuto.setDateInspection(dateInspection);

        System.out.println(newAuto.toString());
        input.close();
    }
}
