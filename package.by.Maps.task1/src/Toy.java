import java.math.BigDecimal;

public class Toy {
    private String name;
    private int agePermition;
    private BigDecimal price;

    public Toy(String name, int agePermition, BigDecimal price) {
        this.name = name;
        this.agePermition = agePermition;
        this.price =price;
    }

    public String getName() {
        return name;
    }

    public int getAgePermition() {
        return agePermition;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, с %d лет, цена: %.2f$.", name, agePermition, price);
    }
}
