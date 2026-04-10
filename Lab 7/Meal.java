class Meal {
    protected String orderID;
    protected String customerName;
    protected int quantity;

    // Default constructor
    public Meal() {
        this.orderID = "000";
        this.customerName = "Guest";
        this.quantity = 0;
    }

    // Parameterized constructor
    public Meal(String orderID, String customerName, int quantity) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
    }

    // First version of calculateBill
    public double calculateBill() {
        return 12.00 * quantity;
    }


    // Second version with coupon
    public double calculateBill(int couponAmount) {
        return calculateBill() - (couponAmount* quantity);
    }
}

// RegularMeal.java
class RegularMeal extends Meal {
    private boolean isVegetarian;

    // Default constructor
    public RegularMeal() {
        super();
        this.isVegetarian = true;
    }

    // Parameterized constructor
    public RegularMeal(String orderID, String customerName, int quantity, boolean isVegetarian) {
        super(orderID, customerName, quantity);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculateBill() {
        return 10.00 * quantity;
    }


    @Override
    public void displayOrderDetails() {
        System.out.println("--- Regular Meal ---");
        super.displayOrderDetails();
        System.out.println("Meal Type: " + (isVegetarian ? "Vegetarian" : "Non-Vegetarian"));
        System.out.println("Total Bill: $" + calculateBill());
    }
}

// ComboMeal.java
class ComboMeal extends Meal {
    private boolean includesDrinkAndDessert;

    // Default constructor
    public ComboMeal() {
        super();
        this.includesDrinkAndDessert = false;
    }

    // Parameterized constructor
    public ComboMeal(String orderID, String customerName, int quantity, boolean includesDrinkAndDessert) {
        super(orderID, customerName, quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }

    @Override
    public double calculateBill() {
        double baseCost = 15.00 * quantity;
        return includesDrinkAndDessert? baseCost + 5 :baseCost;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("--- Combo Meal ---");
        super.displayOrderDetails();
        System.out.println("Includes Drink & Dessert: " + (includesDrinkAndDessert ? "Yes" : "No"));
        System.out.println("Total Bill: $" + calculateBill());
    }
}