import com.google.common.eventbus.EventBus;

public class Main {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        EventListener listener = new EventListener("First listener");
        eventBus.register(listener);

        eventBus.post("String Event");
        eventBus.post(new CustomEvent("Custom event"));
    }

}
