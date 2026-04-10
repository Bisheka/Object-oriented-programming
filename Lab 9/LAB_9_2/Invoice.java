package LAB_9_2;

class Invoice implements Printable {
    private String invoiceId;
    private double amount;

    public Invoice(String invoiceId, double amount) {
        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    @Override
    public void printDetails() {
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("-----------------------------");
    }
}
