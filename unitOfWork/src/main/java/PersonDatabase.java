public class PersonDatabase {

    public void insert(Person person) {
        System.out.println("INSERTED: " + person);
    }

    public void modify(Person person) {
        System.out.println("MODIFIED: " + person);
    }

    public void delete(Person person) {
        System.out.println("DELETED: " + person);
    }
}
