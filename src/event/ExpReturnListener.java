package event;

public class ExpReturnListener implements EventListener {

    private final EventType eventType = EventType.EXPEDITION_RETURN;

    @Override
    public EventType getEventType() {
        return this.eventType;
    }

    @Override
    public void update(String message) {
        Data.expRunning = false;
        System.out.println("Expedition is returning from outside planet. See message attached: " + message);
    }
}
