package Pojazdy_i_wypozyczalnia;

public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(String name, int yearMade, int numberOfSeats) {
        super(name, yearMade);
        this.numberOfSeats = numberOfSeats;
    }

    public Car(){ }

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String toString(){
        return("Name: " + this.getName() + " Year made: " + this.getYearMade() + " Number of seats: " + this.numberOfSeats);
    }
}
