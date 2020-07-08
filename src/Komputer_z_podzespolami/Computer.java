package Komputer_z_podzespolami;

public class Computer {
    private Processor processor;
    private HDD hdd;
    private RAM ram;

    public Computer(Processor processor, HDD hdd, RAM ram) {
        this.processor = processor;
        this.hdd = hdd;
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public HDD getHdd() {
        return hdd;
    }

    public RAM getRam() {
        return ram;
    }
}
