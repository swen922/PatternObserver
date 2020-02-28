package event;

public class OxygeneListener implements EventListener {

    private final EventType eventType = EventType.OXYGENE_FOUND;


    @Override
    public EventType getEventType() {
        return this.eventType;
    }

    @Override
    public void update(String message) {
        System.out.println("Oxygene outside found! See message attached: " + message);
        startOxygeneAnalysis();
    }

    private void startOxygeneAnalysis() {
        System.out.println("Starting oxygene analysis. Do not breath before positive result!");
    }
}
