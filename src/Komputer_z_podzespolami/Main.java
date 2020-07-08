package Komputer_z_podzespolami;

public class Main {
    public static void main(String[] args) throws TemperatureTooHighException{

        Processor processor = new Processor("Intel Pentium 4","Intel","89RB4",3000,50);
        HDD hdd = new HDD("Seagate ST35","Seagate","284TI",500);
        RAM ram = new RAM("ADATA XPG D10","ADATA","AX4U320038G16",16,3200,40);
        Computer computer = new Computer(processor,hdd,ram);

        computer.getProcessor().overclock(200);
        computer.getProcessor().overclock(300); // powoduje wyjatek
    }
}
