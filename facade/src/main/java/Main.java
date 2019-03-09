public class Main {
    public static void main(String[] args) {
        SimpleWriter writer = new SimpleWriterImpl(new ComplexWriter());
        writer.write("Hello world!");
    }
}
