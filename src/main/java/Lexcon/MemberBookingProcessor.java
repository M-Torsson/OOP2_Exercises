package Lexcon;

public class MemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {
        double originalPrice = request.getService().calculatePrice();
        double finalPrice = originalPrice - 10;

        return new Booking(
                request.getCustomerName(),
                request.getService(),
                finalPrice
        );
    }
}