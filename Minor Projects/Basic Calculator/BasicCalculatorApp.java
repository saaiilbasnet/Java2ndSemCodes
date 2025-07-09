import java.util.Scanner;
public class BasicCalculatorApp{

    // Adder method

    public static void addMethod(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("Sum : "+sum);
    }

    // Substractor Method

        public static void subMethod(double num1, double num2){
        double diff = num1 - num2;
        System.out.println("Difference : "+diff);
    }

    // Multiplication Method

            public static void multMethod(double num1, double num2){
        double mult = num1 * num2;
        System.out.println("Product : "+mult);
    }

    // Divsion Method

            public static void divMethod(double num1, double num2){
        double div = num1 / num2;
        System.out.println("Division : "+div);
    }


//    Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //object instantaion
        double num1, num2;
        // String operator;

        System.out.println("Enter first number : ");
        num1 = input.nextDouble();

        System.out.println("Enter second number : ");
        num2 = input.nextDouble();
        
        System.out.println("Enter operator : ");
        char operator = input.next().charAt(0); 

        switch(operator){
        case '+' : addMethod(num1, num2); 
        break;
        case '-' : subMethod(num1, num2);
        break;
        case '*' : multMethod(num1, num2);
        break;
        case '/' : divMethod(num1, num2);
        break;
        default : System.out.println("Invalid!"); 
        }

    }
}