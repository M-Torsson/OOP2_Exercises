package Lexcon;

public class Booking {

    private String customerName;
    private Service service;
    private double finalPrice;

    public Booking(String customerName, Service service, double finalPrice) {
        this.customerName = customerName;
        this.service = service;
        this.finalPrice = finalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Service getService() {
        return service;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    @Override
    public String toString() {
        return "Booking for: " + customerName +
                "\nService: " + service.getName() +
                "\nFinal price: " + (int) finalPrice + " SEK";
    }
}