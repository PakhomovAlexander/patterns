public class Main {
    public static void main(String[] args) {
        Writer trimUpperCaseWriter = new WriterTrimDecorator(new WriterUpperCaseDecorator(new ConsoleWriter()));

        String message = "  My message to be logged.   ";
        trimUpperCaseWriter.write(message);
    }
}
