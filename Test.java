//  Create a Java class called BankAccount with attributes for accountNumber, balance, and accountHolderName. Write a constructor to initialize the attributes and a method to deposit money into the account.

public class Test{

    static String accountNum;
    static float balance=0;
    static String accountHolder;

    //constructor

    public Test(String accountNum, float balance, String accountHolder){
        this.accountNum = accountNum;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    //display function

    public static void displayDetail(){
        System.out.println("Account Number : "+accountNum);
        System.out.println("Balance : "+balance);
        System.out.println("Account Number : "+accountHolder);

    }

    //deposit method

    public static void deposite(float amount){
        balance = balance + amount;
        System.out.println("Deposited : "+amount);
        System.out.println("Total Balance : "+balance);
    }


    // main method
    public static void main(String[] args) {
        
        Test t1 = new Test("123ABC",999,"Saaiil");
        t1.displayDetail();
        t1.deposite(500);

    }

}