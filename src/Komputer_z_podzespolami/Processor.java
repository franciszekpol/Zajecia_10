package Komputer_z_podzespolami;

public class Processor extends Component implements Overclockable{
    private int clockSpeed;
    private int temperature;
    private final int MAX_TEMPERATURE = 80; // ?

    public Processor(String name, String manufacturer, String serialNumber, int clockSpeed, int temperature) {
        super(name, manufacturer, serialNumber);
        this.clockSpeed = clockSpeed;
        this.temperature = temperature;
    }

    // Zwieksza temperature o wartosc podana w MHz
    public void overclock(int value)throws TemperatureTooHighException{
        int tmp = value/10;
        if(this.temperature + tmp > MAX_TEMPERATURE){
            throw new TemperatureTooHighException("Temperatura jest zbyt wysoka!");
        }
        this.temperature += tmp;
        this.clockSpeed += value;
    }
}
