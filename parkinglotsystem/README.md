# Parking Lot System

## Requirements

- The system should support multiple parking lots.
- Each parking lot can have multiple levels, each level with a certain number of parking spots.
- The parking lot should support different types of vehicles, such as cars, motorcycles, and trucks.
- Each parking spot should be able to accommodate a specific type of vehicle.
- The system should assign a parking spot to a vehicle upon entry and release it when the vehicle exits.
- The system should track the availability of parking spots and provide real-time information to customers.
- The system should handle multiple entry and exit points and support concurrent access.

## User Journey

- The user enters the parking lot.
- The system identifies the type of vehicle.
- The system will get all available parking spots in each level based on vehicle type.
- The system will assign 1 parking spot among all the available parking spot using some predefined strategy.
- System will finally generate a parking ticket using current timestamp and allocated parking space and rate of that parking spot.
- User gets a parking ticket which contains start time, parking spot, rate of parking spot.
- The user parks the vehicle in the assigned spot.
- The system updates the availability status in real-time.
- Upon exit, the user retrieves the vehicle, goes to exit point, hand over the ticket.
- System computes the total fees based on parking ticket details.
- Once payment was done successfully, then system releases the parking spot.
- The system provides information about available spots to users at any time.