package Pojazdy_i_wypozyczalnia;

public class MotorBike extends Vehicle{
    private int speedLimit;

    public MotorBike(String name, int yearMade, int speedLimit) {
        super(name, yearMade);
        this.speedLimit = speedLimit;
    }

   public String toString(){
        return("Name: " + this.getName() + " Year made: " + this.getYearMade() + " Speed limit: " + this.speedLimit);
   }
}
