public class WriterUpperCaseDecorator extends WriterDecorator {
    public WriterUpperCaseDecorator(Writer source) {
        super(source);
    }

    @Override
    public void write(final String msg) {
        super.write(msg.toUpperCase());
    }
}
