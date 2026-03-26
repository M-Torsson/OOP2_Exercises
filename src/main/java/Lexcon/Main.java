package Lexcon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Tire Service Booking System ===");

        // Create services
        Service winterService = new WinterTireChange(1, "Winter Tire Change", 100, 20);
        Service summerService = new SummerTireChange(2, "Summer Tire Change", 80, 10);

        // Put them in a list (polymorphism)
        List<Service> services = new ArrayList<>();
        services.add(winterService);
        services.add(summerService);

        // Show prices
        System.out.println("\nAvailable services:");
        for (Service service : services) {
            System.out.println(service.getName() + " price: " + (int) service.calculatePrice() + " SEK");
        }

        // Create booking request
        BookingRequest request = new BookingRequest("Alex", winterService);

        // Member booking
        BookingProcessor memberProcessor = new MemberBookingProcessor();
        Booking memberBooking = memberProcessor.processBooking(request);

        // Non-member booking
        BookingProcessor nonMemberProcessor = new NonMemberBookingProcessor();
        Booking nonMemberBooking = nonMemberProcessor.processBooking(request);

        // Print results
        System.out.println("\nMember booking:");
        System.out.println(memberBooking);

        System.out.println("\nNon-member booking:");
        System.out.println(nonMemberBooking);
    }
}