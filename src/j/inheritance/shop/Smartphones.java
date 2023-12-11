package j.inheritance.shop;
import java.math.BigDecimal;

public class Smartphones extends Product {
// ATTRIBUTI
  private String codeIMEI;
  private int quantitaMemoria;

  // COSTRUTTORE
  public Smartphones(String name, String description, BigDecimal price, BigDecimal vat, String codeIMEI, int quantitaMemoria) {
      super(name, description, price, vat);
      setCodeIMEI(codeIMEI);
      setQuantitaMemoria(quantitaMemoria);
    }

    // getters and setters

    public String getCodeIMEI() {
        return codeIMEI;
    }
    public void setCodeIMEI(String codeIMEI) {
        this.codeIMEI = codeIMEI;
    }
    public int getQuantitaMemoria() {
        return quantitaMemoria;
    }
    public void setQuantitaMemoria(int quantitaMemoria) {
        this.quantitaMemoria = quantitaMemoria;
    }

    @Override
    public String toString() {
        return "Smartphones{" +
                "codeIMEI='" + codeIMEI + '\'' +
                ", quantitaMemoria=" + quantitaMemoria +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
