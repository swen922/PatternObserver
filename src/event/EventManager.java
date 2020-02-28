package event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<EventType, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(EventListener listener) {

        if (listeners.containsKey(listener.getEventType())) {
            listeners.get(listener.getEventType()).add(listener);
        }
        else {
            List<EventListener> list = new ArrayList<>();
            list.add(listener);
            listeners.put(listener.getEventType(), list);
        }
    }


    public void unsubscribe(EventListener listener) {
        listeners.get(listener.getEventType()).remove(listener);
    }

    public void unsubscribe(EventType eventType) {
        listeners.remove(eventType);
    }

    public void unsubscribeAll() {
        listeners.clear();
    }


    public void notifyListener(Event event) {
        if (listeners.containsKey(event.getEventType())) {
            for (EventListener listener : listeners.get(event.getEventType())) {
                listener.update(event.getMessage());
            }
        }
    }

}
