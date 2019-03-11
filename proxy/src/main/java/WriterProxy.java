public class WriterProxy implements Writer {
    private final static String BARRIER = "-------------------";
    private final static Character NEW_LINE = '\n';


    private final Writer writer;

    public WriterProxy() {writer = new WriterImpl();}

    @Override
    public void write(String msg) {
        String modyfiedMsg = BARRIER + NEW_LINE + msg + NEW_LINE + BARRIER;
        writer.write(modyfiedMsg);
    }

}
