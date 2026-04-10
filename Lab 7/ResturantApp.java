class RestuarantApp {

    public static void main(String[] args) {
        // Create objects
        RegularMeal regular = new RegularMeal();
        ComboMeal combo = new ComboMeal("C102", "Alice Green", 2, true);

        // Display details
        regular.displayOrderDetails();
        System.out.println("Bill with $2 coupon: $" + regular.calculateBill(2));
        System.out.println();

        combo.displayOrderDetails();
        System.out.println("Bill with $3 coupon: $" + combo.calculateBill(3));

    }
}