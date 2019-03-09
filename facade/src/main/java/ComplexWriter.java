public class ComplexWriter {
    private String msg;
    private boolean accessToWrite;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setAccessToWrite(boolean accessToWrite) {
        this.accessToWrite = accessToWrite;
    }

    void write() {
        if (!accessToWrite)
            throw new IllegalStateException("Can't write");

        System.out.println(msg);
    }
}
