package event;

public interface EventListener {

    public void update(String message);
    public EventType getEventType();
}
