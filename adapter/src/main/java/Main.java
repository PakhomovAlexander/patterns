public class Main {
    public static void main(String[] args) {
        Writer writer = new WriterStringResultAdapter(new WriterImpl());

        write(writer);
    }

    static void write(Writer writer) {
        String result = writer.write();
        System.out.println("Result is " + result);
    }
}
