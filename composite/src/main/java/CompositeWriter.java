import java.util.LinkedList;
import java.util.List;

public class CompositeWriter implements Writer {
    private List<Writer> childWriters = new LinkedList<>();

    @Override
    public void write(String msg) {
        childWriters.forEach(writer -> writer.write(msg));
    }

    public void add(Writer writer) {
        childWriters.add(writer);
    }

    public void remove(Writer writer) {
        childWriters.remove(writer);
    }
}
