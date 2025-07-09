public class Customer {
     private int customerId;
    String customerName;
    String customerBillingAddress;

    //constructor
    public Customer(int customerId, String customerName, String customerBillingAddress){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBillingAddress = customerBillingAddress;
    }
    // setter

    public void setCustomerId(int productId){
        this.customerId = customerId;
    }

    // getter

    public int getCustomerId(){
        return customerId;
    }

    //display info 

    public void displayInfo(){
        System.out.println(customerId);
        System.out.println(customerName);
        System.out.println(customerBillingAddress);
    }

    public static void main(String[] args){

        //constructor initilization
        Customer myCustomer = new Customer(1, "Saaiil Basnet", "Gatthaghar, Madhyapur Thimi, Bhaktapur");
        myCustomer.displayInfo();
}

}
