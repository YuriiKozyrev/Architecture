package observer;

import java.util.HashMap;


public class PriceList extends EventManager{
    private HashMap<String, Double> priceList = new HashMap<String, Double>();

    public void addSomethingToPriceList(String name, Double price) {
        priceList.put(name, price);
        notify(priceList);
    }

}
