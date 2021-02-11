package observer.listeners;

import observer.EventManager;

public class AppPriceListUpdateListener implements EventListener {
    @Override
    public void update(EventManager eventManager, Object arg) {
        System.out.println("Прайс-лист приложения изменен:" + arg);
    }
}
