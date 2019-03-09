public class LaptopFactory {
    Laptop getLaptop(LaptopNames name) {
        switch (name) {
            case MACBOOK:
                return new MacBook();
            case ASUS:
                return new Asus();
            case DELL:
                return new Dell();
            default:
                throw new IllegalArgumentException("Wrong laptop name:" + name);
        }
    }
}
