package observer;

import observer.listeners.EventListener;

import java.util.ArrayList;
import java.util.List;;

public abstract class EventManager {
    private List<EventListener> eventListeners = new ArrayList<>();


    public void subscribe(EventListener eventListener) {
        eventListeners.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener) {
        eventListeners.remove(eventListener);
    }

    protected void notify(Object arg) {
        for (EventListener eventListener : eventListeners) {
            eventListener.update(this, arg);
        }
    }
}
