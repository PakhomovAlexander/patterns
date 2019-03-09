public class SimpleWriterImpl implements SimpleWriter {
    private ComplexWriter writer;

    public SimpleWriterImpl(ComplexWriter writer) {this.writer = writer;}

    @Override
    public void write(String msg) {
        writer.setAccessToWrite(true);
        writer.setMsg(msg);

        writer.write();
    }
}
