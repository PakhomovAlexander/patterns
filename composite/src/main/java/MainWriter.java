public class MainWriter implements Writer {

    @Override
    public void write(String msg) {
        System.out.println(getClass().getSimpleName());
        System.out.println(msg);
    }
}
