package lab4;

public class Equipment {
    private final String sport;
    private final int price;
    private final int stockQuantity;
    private final String name;
    private final int id;

    public Equipment(String sport, int price, int stockQuantity, String name, int id) {
        this.sport = sport;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.id = id;
    }

    public String getSport() {
        return this.sport;
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Equipment{Type of sport ='" + this.sport + ", Name =" + this.name + "', Price =" + this.price + ", Quantity in the stock =" + this.stockQuantity + "', Website id =" + this.id + "}";
    }
}
