package Komputer_z_podzespolami;

public class HDD extends Component{
    private int capacity;

    public HDD(String name, String manufacturer, String serialNumber, int capacity){
        super(name, manufacturer, serialNumber);
        this.capacity = capacity;
    }
}
