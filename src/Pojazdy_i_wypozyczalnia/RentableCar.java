package Pojazdy_i_wypozyczalnia;

public class RentableCar extends Car implements Rentable{
    private Person renter;

    public RentableCar(String name, int yearMade, int numberOfSeats) {
        super(name, yearMade, numberOfSeats);
    }

    public void rent(String firstName, String lastName, String id){
        this.renter = new Person(firstName, lastName, id);
    }

    public void handOver(){
        this.renter = null;
    }

    public boolean isRent(){
        if(this.renter != null) { return true; }
        else return false;
    }

}
