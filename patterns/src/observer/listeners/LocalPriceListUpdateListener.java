package observer.listeners;

import observer.EventManager;

public class LocalPriceListUpdateListener implements EventListener {
    @Override
    public void update(EventManager eventManager, Object arg) {
        System.out.println("Локальный прайс-лист изменен: " + arg);
    }
}
