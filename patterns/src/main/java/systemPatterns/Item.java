package systemPatterns;

public class Item {


    private int id;
    private String title;
    private int price;

    public Item(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String info(){
        String str = this.id + this.title + this.price;
        return  str;
    }
}
