package Lexcon;

public class NonMemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {
        double finalPrice = request.getService().calculatePrice();

        return new Booking(
                request.getCustomerName(),
                request.getService(),
                finalPrice
        );
    }
}