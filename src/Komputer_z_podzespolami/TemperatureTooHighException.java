package Komputer_z_podzespolami;

public class TemperatureTooHighException extends Exception{
    public TemperatureTooHighException() {
    }

    public TemperatureTooHighException(String message) {
        super(message);
    }
}
