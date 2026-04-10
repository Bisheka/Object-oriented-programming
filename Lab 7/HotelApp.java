public class HotelApp {
    public static void main(String[] args) {
        // Create objects
        StandardRoom standard = new StandardRoom();
        LuxurySuite luxury = new LuxurySuite("305", "Alice Green", 3, true);

        // Display details
        standard.displayRoomDetails();
        System.out.println("Discounted Cost (per night $10 off): $" +
                standard.calculateRoomCost(10));
        System.out.println();

        luxury.displayRoomDetails();
        System.out.println("Discounted Cost (per night $15 off): $" +
                luxury.calculateRoomCost(15));
    }
}
