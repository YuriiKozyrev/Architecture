package systemPatterns;

import java.util.HashMap;

public class ItemIdentityMap {
   private HashMap<Integer, Item> itemMap = new HashMap<>();

    public void addItem(Item item){
        itemMap.put(item.getId(), item);
        System.out.println("Добавили в кэш: " + item.getTitle());
    }

    public Item getItem(int id){
        System.out.println("Достали из кэша: " + itemMap.get(id).getTitle());
        return itemMap.get(id);
    }

}
