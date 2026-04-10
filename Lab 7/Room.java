class Room {
    protected String roomNumber;
    protected String guestName;
    protected int nights;

    // Default constructor
    public Room() {
        this.roomNumber = "000";
        this.guestName = "Unknown";
        this.nights = 0;
    }

    // Parameterized constructor
    public Room(String roomNumber, String guestName, int nights) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.nights = nights;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Nights: " + nights);
    }

    // First version of calculateRoomCost
    public double calculateRoomCost() {
        return 150.00 * nights;
    }

    // Second version with discount
    public double calculateRoomCost(int discountPerNight) {
        return calculateRoomCost() - (discountPerNight * nights);
    }
}

class StandardRoom extends Room {
    private boolean wifiIncluded;

    // Default constructor
    public StandardRoom() {
        super();
        this.wifiIncluded = false;
    }

    // Parameterized constructor
    public StandardRoom(String roomNumber, String guestName, int nights, boolean wifiIncluded) {
        super(roomNumber, guestName, nights);
        this.wifiIncluded = wifiIncluded;
    }

    @Override
    public double calculateRoomCost() {
        return 100.00 * nights;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("--- Standard Room ---");
        super.displayRoomDetails();
        System.out.println("Wi-Fi Included: " + (wifiIncluded ? "Yes" : "No"));
        System.out.println("Total Cost: $" + calculateRoomCost());
    }
}

class LuxurySuite extends Room {
    private boolean extraServices;

    // Default constructor
    public LuxurySuite() {
        super();
        this.extraServices = false;
    }

    // Parameterized constructor
    public LuxurySuite(String roomNumber, String guestName, int nights, boolean extraServices) {
        super(roomNumber, guestName, nights);
        this.extraServices = extraServices;
    }

    @Override
    public double calculateRoomCost() {
        double total = 200.00 * nights;
        if (extraServices) {
            total += 75.00;
        }
        return total;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("--- Luxury Suite ---");
        super.displayRoomDetails();
        System.out.println("Breakfast & Airport Pickup: " + (extraServices ? "Included" : "Not Included"));
        System.out.println("Total Cost: $" + calculateRoomCost());
    }
}


