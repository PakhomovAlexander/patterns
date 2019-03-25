import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonRepo implements UnitOfWork<Person> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Person.class.getName());

    private Map<String, List<Person>> context;
    private PersonDatabase personDatabase;

    public PersonRepo(Map<String, List<Person>> context, PersonDatabase personDatabase) {
        this.context = context;
        this.personDatabase = personDatabase;
    }

    @Override
    public void registerNew(Person person) {
        LOGGER.info("Registering {} for insert in context.", person.getName());
        register(person, UnitOfWork.INSERT);
    }

    @Override
    public void registerModified(Person person) {
        LOGGER.info("Registering {} for modify in context.", person.getName());
        register(person, UnitOfWork.MODIFY);

    }

    @Override
    public void registerDeleted(Person person) {
        LOGGER.info("Registering {} for delete in context.", person.getName());
        register(person, UnitOfWork.DELETE);
    }

    private void register(Person person, String operation) {
        List<Person> personsToOperate = context.get(operation);
        if (personsToOperate == null) {
            personsToOperate = new ArrayList<>();
        }
        personsToOperate.add(person);
        context.put(operation, personsToOperate);
    }

    @Override
    public void commit() {
        if (context == null || context.size() == 0) {
            return;
        }
        LOGGER.info("Commit started");
        if (context.containsKey(UnitOfWork.INSERT)) {
            commitInsert();
        }

        if (context.containsKey(UnitOfWork.MODIFY)) {
            commitModify();
        }
        if (context.containsKey(UnitOfWork.DELETE)) {
            commitDelete();
        }
        LOGGER.info("Commit finished.");
    }

    private void commitInsert() {
        List<Person> personsToBeInserted = context.get(UnitOfWork.INSERT);
        for (Person person : personsToBeInserted) {
            LOGGER.info("Saving {} to database.", person.getName());
            personDatabase.insert(person);
        }
    }

    private void commitModify() {
        List<Person> modifiedPersons = context.get(UnitOfWork.MODIFY);
        for (Person person : modifiedPersons) {
            LOGGER.info("Modifying {} to database.", person.getName());
            personDatabase.modify(person);
        }
    }

    private void commitDelete() {
        List<Person> deletedPersons = context.get(UnitOfWork.DELETE);
        for (Person person : deletedPersons) {
            LOGGER.info("Deleting {} to database.", person.getName());
            personDatabase.delete(person);
        }
    }
}
