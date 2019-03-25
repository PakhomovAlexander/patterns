import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person ram = new Person(1, "Ram", "Street 9, Cupertino");
        Person shyam = new Person(2, "Shyam", "Z bridge, Pune");
        Person gopi = new Person(3, "Gopi", "Street 10, Mumbai");

        HashMap<String, List<Person>> context = new HashMap<>();
        PersonDatabase personDatabase = new PersonDatabase();
        PersonRepo personRepository = new PersonRepo(context, personDatabase);

        personRepository.registerNew(ram);
        personRepository.registerModified(shyam);
        personRepository.registerDeleted(gopi);
        personRepository.commit();
    }
}
