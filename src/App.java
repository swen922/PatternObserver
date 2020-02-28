import event.Event;
import event.EventManager;
import event.EventType;

/** Наблюдатель, также известен как: Издатель-Подписчик, Слушатель, Observer */

public class App {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        CommandPost commandPost = new CommandPost(eventManager);
        commandPost.startWorking();

        commandPost.sendEvent(new Event(EventType.EARTH_FLIGHT_ARRIVED, "Friends came from Earth! We've got food and drink!"));
        commandPost.sendEvent(new Event(EventType.EXPEDITION_DEPART, "All scientists go to expedition. We a looking for Water, Oxygene and beautiful Amazons."));
        sleep(4000);
        commandPost.sendEvent(new Event(EventType.WATER_FOUND, "Expedition found water! We can wash our hands and genitals!"));
        sleep(2000);
        commandPost.sendEvent(new Event(EventType.OXYGENE_FOUND, "Expedition found Oxygene! We can breath every day now!"));
        sleep(2000);
        commandPost.sendEvent(new Event(EventType.EXPEDITION_RETURN, "Half of scientists was married Amazons, but part of them is with us now!"));
        commandPost.sendEvent(new Event(EventType.ALIENS_ATTACK, "Amazons came to ask their husbands! Close all doors! Incapsulate whole Base!"));
        commandPost.sendEvent(new Event(EventType.EVACUATION_STARTED, "Let's go home with our new Amazons wives!"));

    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }
}
