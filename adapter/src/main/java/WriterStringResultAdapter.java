public class WriterStringResultAdapter implements Writer {
    private WriterImpl writer;

    public WriterStringResultAdapter(WriterImpl writer) {this.writer = writer;}

    @Override
    public String write() {
        if (writer.write())
            return "true";

        return "false";
    }
}
