package observer.listeners;

import observer.EventManager;

public interface EventListener {
    void update(EventManager eventManager, Object arg);
}
