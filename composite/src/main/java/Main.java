public class Main {
    public static void main(String[] args) {
        Writer first = new BarrierWriter();
        Writer second = new MainWriter();

        CompositeWriter composite = new CompositeWriter();
        composite.add(first);
        composite.add(second);

        composite.write(" says hello");
    }
}
