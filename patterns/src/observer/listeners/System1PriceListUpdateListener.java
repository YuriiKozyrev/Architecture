package observer.listeners;

import observer.EventManager;

public class System1PriceListUpdateListener implements EventListener {
    @Override
    public void update(EventManager eventManager, Object arg) {
        System.out.println("Прайс-лист System1 изменен: "  + arg);
    }
}
