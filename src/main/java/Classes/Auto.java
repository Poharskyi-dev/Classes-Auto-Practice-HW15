package Classes;
import java.time.LocalDate;
import java.time.Period;

public class Auto {

    //variables
    private int tankFullness;
    private double fuelConsumption;
    private LocalDate dateInspection;
    private int maxTankFullness;
    java.time.LocalDate currentDate = java.time.LocalDate.now();

    public Auto() {
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


    public double getTankFullness() {
        return this.tankFullness;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public LocalDate getDateInspection() {
        return this.dateInspection;
    }

    public int getMaxTankFullness() {
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

    public void driveAbility() {
        if (tankFullness > 1) {
            System.out.println("Lets go \uD83D\uDCA8\uD83D\uDCA8\uD83D\uDCA8");
        } else {
            System.out.println("Better to refuel this car!");
        }
    }

    public void exploitionAbility() {
        Period period = Period.between(dateInspection, currentDate);

        if (period.getYears() > 2 || (period.getYears() == 2 && (period.getMonths() > 0 || period.getDays() > 0))) {
            System.out.println("The technical inspection has expired, you need to go through it again");
        } else if (period.getYears() < 2 || (period.getYears() == 2 && period.getMonths() == 0 && period.getDays() == 0)) {
            System.out.println("The technical inspection is still valid");
        } else {
            System.out.println("==");
        }

        LocalDate endDate = dateInspection.plusYears(2);
        Period remainingPeriod = Period.between(currentDate, endDate);

        if (remainingPeriod.isNegative()){
        } else {
            System.out.println("Time remaining until two-year period: " +
            remainingPeriod.getYears() + " years, " +
            remainingPeriod.getMonths() + " months, and " +
            remainingPeriod.getDays() + " days.");
        }
    }

    public void howFarTravel() {
        if (tankFullness > 1) {
            double distance = (double) tankFullness / fuelConsumption * 100;
            double roundedDistance = Math.round(distance * 100.0) / 100.0;
            System.out.println("Enough gasoline for " + roundedDistance + " km");
        } else {
            System.out.println("Better to refuel this car!");
        }
    }
}




