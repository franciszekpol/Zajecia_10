package Komputer_z_podzespolami;

public abstract class Component {
    String name;
    String manufacturer;
    String serialNumber;

    public Component() {
    }

    public Component(String name, String manufacturer, String serialNumber) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }
}
