package Pojazdy_i_wypozyczalnia;

public abstract class Vehicle implements Moveable{
    private String name;
    private int yearMade;
    private String direction;

    public Vehicle(String name, int yearMade) {
        this.name = name;
        this.yearMade = yearMade;
    }

    public Vehicle() {
    }

    public void turnLeft(){
        this.direction = "Left";
    }

    public void turnRight(){
        this.direction = "Right";
    }

    public void goForward(){
        this.direction = "Forward";
    }

    public void goBack(){
        this.direction = "Back";
    }

    public String getName() {
        return name;
    }

    public int getYearMade() {
        return yearMade;
    }

    public String getDirection() {
        return direction;
    }
}
