// Base class
class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    void dispatch() {
        System.out.println(name + " is being dispatched.");
    }
}

// Bus subclass
class Bus extends Vehicle {
    int passengerCapacity;
    String route;

    Bus(String name, int passengerCapacity, String route) {
        super(name);
        this.passengerCapacity = passengerCapacity;
        this.route = route;
    }

    @Override
    void dispatch() {
        System.out.println(name + " is running on route " + route + " with capacity of " + passengerCapacity + " passengers.");
    }
}

// Taxi subclass
class Taxi extends Vehicle {
    double farePerKm;
    double distance;

    Taxi(String name, double farePerKm, double distance) {
        super(name);
        this.farePerKm = farePerKm;
        this.distance = distance;
    }

    @Override
    void dispatch() {
        double fare = farePerKm * distance;
        System.out.println(name + " is providing door-to-door service.");
        System.out.println("Distance: " + distance + " km | Fare: ₹" + fare);
    }
}

// Train subclass
class Train extends Vehicle {
    int numberOfCars;
    String schedule;

    Train(String name, int numberOfCars, String schedule) {
        super(name);
        this.numberOfCars = numberOfCars;
        this.schedule = schedule;
    }

    @Override
    void dispatch() {
        System.out.println(name + " is operating on schedule: " + schedule + " with " + numberOfCars + " cars.");
    }
}

// Bike subclass
class Bike extends Vehicle {
    double distance;

    Bike(String name, double distance) {
        super(name);
        this.distance = distance;
    }

    @Override
    void dispatch() {
        System.out.println(name + " is available for a short eco-friendly trip of " + distance + " km.");
    }
}

// Main class
public class TransportationFleet {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[4];

        fleet[0] = new Bus("City Bus 101", 50, "Downtown Loop");
        fleet[1] = new Taxi("Yellow Taxi", 20, 12.5);
        fleet[2] = new Train("Express Line", 10, "9:00 AM - 11:00 AM");
        fleet[3] = new Bike("Eco Bike", 5);

        System.out.println("🚦 Transportation Dispatch System 🚦\n");

        for (Vehicle v : fleet) {
            v.dispatch(); // Dynamic method dispatch in action
            System.out.println();
        }
    }
}
