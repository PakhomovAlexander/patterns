import com.google.common.eventbus.Subscribe;

public class EventListener {

    private static int eventsHandled;

    private final String name;

    public EventListener(String name) {this.name = name;}

    @Subscribe
    public void stringEvent(String event) {
        System.out.println(name + " listener got " + ++eventsHandled + " events");
    }

    @Subscribe
    public void customEvent(CustomEvent event) {
        System.out.println(name + " listener got custom event " + event.getMessage());
    }

    public String getName() {
        return name;
    }
}