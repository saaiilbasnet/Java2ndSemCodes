public class InventorySystem {

    // Single instances (not lists, since you just want to display them)
    Product product;
    Customer customer;
    Order order;

    // Constructor
    public InventorySystem(Product product, Customer customer, Order order) {
        this.product = product;
        this.customer = customer;
        this.order = order;
    }

    // Display all info
    public void displayInventoryDetails() {
        System.out.println("=== Product Details ===");
        product.displayInfo();

        System.out.println("\n=== Customer Details ===");
        customer.displayInfo();

        System.out.println("\n=== Order Details ===");
        order.displayInfo();
    }

    // Main method
    public static void main(String[] args) {

        // Create objects using your existing classes
        Product myProduct = new Product(1, "Bagpack", 2000.0);
        Customer myCustomer = new Customer(101, "Saaiil Basnet", "Gatthaghar, Madhyapur Thimi");
        Order myOrder = new Order(1001, "Bagpack's Order", "Pending");

        // Pass them to InventorySystem
        InventorySystem inventory = new InventorySystem(myProduct, myCustomer, myOrder);

        // Display everything
        inventory.displayInventoryDetails();
    }
}
