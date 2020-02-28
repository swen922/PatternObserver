package event;

public class ExpDepartListener implements EventListener {

    private final EventType eventType = EventType.EXPEDITION_DEPART;
    private Runnable runnable;
    private int counter = 0;

    @Override
    public EventType getEventType() {
        return this.eventType;
    }

    @Override
    public void update(String message) {
        Data.expRunning = true;
        System.out.println("Expedition is departing to explore planet. See message attached: " + message);
        startExpCounter();
    }

    private void startExpCounter() {
        runnable = new Runnable() {
            @Override
            public void run() {
                while (Data.expRunning) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    if (Data.expRunning) {
                        System.out.println("Days of expedition working: " + ++counter + "\n");
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
