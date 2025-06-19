import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int myNum = myObj.nextInt();

        int fact = facto(myNum);

        System.out.println("The factorial of " + myNum + " is " + fact);

        myObj.close(); 
    }
    public static int facto(int myNum){
            if(myNum==0){
                return 1;
            }

            else{
                return facto(myNum-1)*myNum;

               }
    }

}
