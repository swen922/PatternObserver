import event.*;

public class CommandPost {

    private EventManager eventManager;

    public CommandPost(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void startWorking() {
        eventManager.subscribe(new AttackListener());
        eventManager.subscribe(new EvacListener());
        eventManager.subscribe(new ExpDepartListener());
        eventManager.subscribe(new ExpReturnListener());
        eventManager.subscribe(new FlightListener());
        eventManager.subscribe(new OxygeneListener());
        eventManager.subscribe(new WaterListener());
    }

    public void endWorking() {
        eventManager.unsubscribeAll();
    }

    public void sendEvent(Event event) {
        sendMessageToEarth("CommandPost notify: new event happened. EventType = " + event.getEventType());
        eventManager.notifyListener(event);
        System.out.println("");
    }

    private void sendMessageToEarth(String message) {
        System.out.println("Message from Base to Earth: " + message);
    }


}
