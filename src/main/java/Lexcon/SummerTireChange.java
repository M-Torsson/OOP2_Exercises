package Lexcon;

public class SummerTireChange extends Service {

    private double discount;

    public SummerTireChange(int id, String name, double basePrice, double discount) {
        super(id, name, basePrice);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() - discount;
    }
}