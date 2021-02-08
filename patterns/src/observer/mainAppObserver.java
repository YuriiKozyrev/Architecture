package observer;

import observer.listeners.AppPriceListUpdateListener;
import observer.listeners.LocalPriceListUpdateListener;
import observer.listeners.System1PriceListUpdateListener;


public class mainAppObserver {
    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        priceList.subscribe(new LocalPriceListUpdateListener());
        priceList.subscribe(new AppPriceListUpdateListener());
        priceList.subscribe(new System1PriceListUpdateListener());

        priceList.addSomethingToPriceList("Меч короля Артура", 10.8);

    }

}
