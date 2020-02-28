package event;

public class AttackListener implements EventListener {

    private final EventType eventType = EventType.ALIENS_ATTACK;

    @Override
    public EventType getEventType() {
        return this.eventType;
    }

    @Override
    public void update(String message) {
        System.out.println("Aliens attack! See message attached: " + message);
        openArmory();
        startDefense();
    }

    private void startDefense() {
        System.out.println("All men are invoked for defense!");
    }

    private void openArmory() {
        System.out.println("Armory is opened! Get your weapon!");
    }


}
