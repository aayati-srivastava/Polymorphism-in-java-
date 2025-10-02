class HotelBooking {

    // Standard booking (room type and nights)
    void calculatePrice(String roomType, int nights) {
        double rate = getRate(roomType);
        double total = rate * nights;

        System.out.println("\n--- Standard Booking ---");
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Rate per Night: ₹" + rate);
        System.out.println("Total Price: ₹" + total);
    }

    // Seasonal booking (room type, nights + seasonal multiplier)
    void calculatePrice(String roomType, int nights, double seasonalMultiplier) {
        double rate = getRate(roomType);
        double basePrice = rate * nights;
        double seasonalPrice = basePrice * seasonalMultiplier;

        System.out.println("\n--- Seasonal Booking ---");
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Rate per Night: ₹" + rate);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier);
        System.out.println("Total Price: ₹" + seasonalPrice);
    }

    // Corporate booking (room type, nights + corporate discount + meal package)
    void calculatePrice(String roomType, int nights, double corporateDiscount, double mealPackage) {
        double rate = getRate(roomType);
        double basePrice = rate * nights;
        double discount = basePrice * (corporateDiscount / 100);
        double total = basePrice - discount + mealPackage;

        System.out.println("\n--- Corporate Booking ---");
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Rate per Night: ₹" + rate);
        System.out.println("Corporate Discount: " + corporateDiscount + "% (₹" + discount + ")");
        System.out.println("Meal Package: ₹" + mealPackage);
        System.out.println("Total Price: ₹" + total);
    }

    // Wedding package (room type, nights + guest count + decoration fee + catering options)
    void calculatePrice(String roomType, int nights, int guestCount, double decorationFee, double cateringCost) {
        double rate = getRate(roomType);
        double basePrice = rate * nights;
        double guestCharge = guestCount * 500; // ₹500 per guest
        double total = basePrice + guestCharge + decorationFee + cateringCost;

        System.out.println("\n--- Wedding Package ---");
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Rate per Night: ₹" + rate);
        System.out.println("Guest Count: " + guestCount + " (₹" + guestCharge + ")");
        System.out.println("Decoration Fee: ₹" + decorationFee);
        System.out.println("Catering Cost: ₹" + cateringCost);
        System.out.println("Total Price: ₹" + total);
    }

    // Helper method to get room rate
    private double getRate(String roomType) {
        switch (roomType.toLowerCase()) {
            case "deluxe":
                return 5000;
            case "suite":
                return 8000;
            case "standard":
            default:
                return 3000;
        }
    }
}

// Main class
public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking();

        booking.calculatePrice("Standard", 3);
        booking.calculatePrice("Suite", 5, 1.2); // seasonal multiplier
        booking.calculatePrice("Deluxe", 4, 15, 2000); // corporate
        booking.calculatePrice("Suite", 7, 50, 15000, 50000); // wedding
    }
}
