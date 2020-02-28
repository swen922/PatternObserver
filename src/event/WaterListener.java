package event;

public class WaterListener implements EventListener {

    private final EventType eventType = EventType.WATER_FOUND;

    @Override
    public EventType getEventType() {
        return this.eventType;
    }

    @Override
    public void update(String message) {
        System.out.println("Water outside found! See message attached: " + message);
        startWaterAnalysis();
    }

    private void startWaterAnalysis() {
        System.out.println("Starting water analysis. Do not drink before positive result!");
    }
}
