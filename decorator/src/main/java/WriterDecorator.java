public class WriterDecorator implements Writer {
    private final Writer wrappee;

    public WriterDecorator(Writer wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void write(final String msg) {
        wrappee.write(msg);
    }
}
