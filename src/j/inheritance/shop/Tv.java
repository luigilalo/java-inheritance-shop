package j.inheritance.shop;

import java.math.BigDecimal;

public class Tv extends Product {
// ATTRIBUTI
    String dimensions;
    boolean isSmart;

    // GETTERS, SETTERS
    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    // COSTRUTTORE
    public Tv (String name, String description, BigDecimal price, BigDecimal vat, String dimensions, boolean isSmart) {
        super(name, description, price, vat);
        setDimensions(dimensions);
        setSmart(isSmart);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "dimensions='" + dimensions + '\'' +
                ", isSmart=" + isSmart +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
