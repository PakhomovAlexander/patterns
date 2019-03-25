public class WriterTrimDecorator extends WriterDecorator {
    public WriterTrimDecorator(Writer source) {
        super(source);
    }

    @Override
    public void write(final String msg) {
        super.write(msg.trim());
    }
}
