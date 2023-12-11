package j.inheritance.shop;

import java.math.BigDecimal;

public class Headphones extends Product {

    // ATTRIBUTI
    String color;
    String wirlessOrCablate;

    // GETTERS, SETTERS
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getWirlessOrCablate() {
        return wirlessOrCablate;
    }
    public void setWirlessOrCablate(String wirlessOrCablate) {
        this.wirlessOrCablate = wirlessOrCablate;
    }
    // COSTRUTTORE
     public Headphones (String name, String description, BigDecimal price, BigDecimal vat, String color, String wirlessOrCablate) {
        super(name, description, price, vat);
        setColor(color);
        setWirlessOrCablate(wirlessOrCablate);
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "color='" + color + '\'' +
                ", wirlessOrCablate='" + wirlessOrCablate + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
