import com.google.common.base.MoreObjects;

public class Person {
    private final Integer id;
    private final String name;
    private final String address;

    public Person(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("Id = ", id)
                          .add("Name = ", name)
                          .add("Address = ", address).toString();
    }
}