# TireServiceBooking

This project is a simple Java application created to demonstrate basic Object-Oriented Programming (OOP) concepts.

## Features

- Different tire services (Winter and Summer)
- Price calculation for each service
- Booking system for customers
- Different booking processing for members and non-members

## OOP Concepts Used

### Inheritance
A base abstract class `Service` is created, and two subclasses extend it:
- WinterTireChange
- SummerTireChange

### Polymorphism
Services are stored in a list of type `Service`, and each service calculates its price differently using the overridden `calculatePrice()` method.

### Abstraction
An interface `BookingProcessor` is used to process bookings.
There are two implementations:
- MemberBookingProcessor (applies a discount)
- NonMemberBookingProcessor (normal price)

## How it works

1. Create service objects
2. Store them in a list
3. Display service prices
4. Create a booking request
5. Process the booking using different processors
6. Display the final result

## Example Output

Booking for: Alex  
Service: Winter Tire Change  
Final price: 110 SEK
