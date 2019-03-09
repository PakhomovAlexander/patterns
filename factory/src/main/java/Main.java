public class Main {
    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();

        Laptop mac = factory.getLaptop(LaptopNames.MACBOOK);
        Laptop asus = factory.getLaptop(LaptopNames.ASUS);
        Laptop dell = factory.getLaptop(LaptopNames.DELL);

        mac.type();
        asus.type();
        dell.type();
    }
}
