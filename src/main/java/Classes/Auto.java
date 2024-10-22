package Classes;
import java.time.LocalDate;

public class Auto {

    //variables
    private int tankFullness;
    private double fuelConsumption;
    private LocalDate dateInspection;
    private int maxTankFullness;

    public Auto(){
        System.out.println("unidentified auto created");
    }

    public Auto(int tankFullness, double fuelConsumption, LocalDate dateInspection) {
        this.tankFullness = tankFullness;
        this.fuelConsumption = fuelConsumption;
        this.dateInspection = dateInspection;
        System.out.println("auto created");
    }

    public void setTankFullness(int tankFullness) {
        if (tankFullness > maxTankFullness) {
            this.tankFullness = maxTankFullness;
        } else {
            this.tankFullness = tankFullness;
        }
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setDateInspection(LocalDate dateInspection) {
        this.dateInspection = dateInspection;
    }

    public void setMaxTankFullness(int maxTankFullness) {
        this.maxTankFullness = maxTankFullness;
    }


    public double getTankFullness () {
        return this.tankFullness;
    }

    public double getFuelConsumption () {
        return this.fuelConsumption;
    }

    public LocalDate getDateInspection () {
        return this.dateInspection;
    }

    public int getMaxTankFullness () {
        return this.maxTankFullness;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "tankFullness=" + tankFullness +
                ", fuelConsumption=" + fuelConsumption +
                ", dateInspection=" + dateInspection +
                '}';
    }
}





