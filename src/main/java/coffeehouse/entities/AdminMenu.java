package coffeehouse.entities;

public class AdminMenu {
    String name;
    int price;
    int amount;

    public AdminMenu(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
