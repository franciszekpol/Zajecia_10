package Pojazdy_i_wypozyczalnia;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("Volvo", 2014,5);
        Vehicle vehicle2 = new MotorBike("Suzuki",2018,240);

        Vehicle[] arr = {vehicle1,vehicle2};

        for (Vehicle v: arr) {
            System.out.println(v);
        }

        Vehicle vehicle3 = new RentableCar("Fiat",1975,4);
        vehicle3.rent();

    }
}
