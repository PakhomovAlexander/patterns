public class Main {
    public static void main(String[] args) {
        Writer proxy = new WriterProxy();

        proxy.write("Message with barrier");
    }
}
