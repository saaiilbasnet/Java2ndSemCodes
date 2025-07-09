public class Order{
    private int orderId;
    String orderName;
    String orderStatus;

    //constructor
    public Order(int orderId, String orderName, String orderStatus){
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderStatus = orderStatus;
    }
    // setter

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    // getter

    public int getOrderId(){
        return orderId;
    }

    //display info 

    public void displayInfo(){
        System.out.println(orderId);
        System.out.println(orderName);
        System.out.println(orderStatus);
    }

    public static void main(String[] args){

        //constructor initilization
        Order myOrder = new Order(1, "Bagpack's Order", "Pending");
        myOrder.displayInfo();
    }
}