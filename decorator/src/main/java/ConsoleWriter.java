public class ConsoleWriter implements Writer {
    @Override
    public void write(final String msg) {
        System.out.println(msg);
    }
}
