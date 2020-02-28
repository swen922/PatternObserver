package event;

public class EvacListener implements EventListener {

    private final EventType eventType = EventType.EVACUATION_STARTED;

    @Override
    public EventType getEventType() {
        return this.eventType;
    }

    @Override
    public void update(String message) {
        System.out.println("Evacuation of the Base is declared! See message attached: " + message);
        prepareShip();
        startShip();
    }

    private void prepareShip() {
        System.out.println("Evacuation SpaceShip is ready. Please take your seats!");
    }

    private void startShip() {
        System.out.println("Doors closed. SpaceShip is starting. Don't leave your seats before zero gravity!");
    }
}
