package Lexcon;

public class WinterTireChange extends Service {

    private double storageFee;

    public WinterTireChange(int id, String name, double basePrice, double storageFee) {
        super(id, name, basePrice);
        this.storageFee = storageFee;
    }

    public double getStorageFee() {
        return storageFee;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + storageFee;
    }
}