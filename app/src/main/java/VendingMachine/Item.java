package VendingMachine;

public class Item {
    String name;
    ItemType type;
    int price;
    String desc;

    public Item(String name, ItemType type, int price, String desc) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public ItemType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
