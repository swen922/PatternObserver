package event;

public class FlightListener implements EventListener {

    private final EventType eventType = EventType.EARTH_FLIGHT_ARRIVED;

    @Override
    public EventType getEventType() {
        return this.eventType;
    }

    @Override
    public void update(String message) {
        System.out.println("Earth flight is arriving. See message attached: " + message);
        acceptEarthFlight();
    }

    private void acceptEarthFlight() {
        System.out.println("Earth Expedition accepting procedure started.");
    }
}
