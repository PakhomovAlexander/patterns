public class Main {
    public static void main(String[] args) {
        Iterable<String> iterable = new MyList();

        for (String elem : iterable){
            System.out.println(elem);
        }
    }
}
