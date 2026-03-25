package Lexcon;

public class BookingRequest {

    private String customerName;
    private Service service;

    public BookingRequest(String customerName, Service service) {
        this.customerName = customerName;
        this.service = service;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Service getService() {
        return service;
    }
}