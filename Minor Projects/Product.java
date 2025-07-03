public class Product{
    private int productId;
    String productName;
    double productPrice;

    //constructor
    public Product(int productId, String productName, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    // setter

    public void setProductId(int productId){
        this.productId = productId;
    }

    // getter

    public int getProductId(){
        return productId;
    }

    //display info 

    public void displayInfo(){
        System.out.println(productId);
        System.out.println(productName);
        System.out.println(productPrice);
    }

    public static void main(String[] args){

        //constructor initilization
        Product myProduct = new Product(1, "Bagpack", 2000.0);
        myProduct.displayInfo();
    }
}