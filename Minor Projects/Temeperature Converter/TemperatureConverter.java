import java.util.Scanner;

public class TemperatureConverter{

    public static void CelToFah(double temp){
        double constantValue = 1.8;
        double result =  (temp*constantValue)+32.0;
        System.out.println(temp+"°C = "+result+"°F");
    }
    public static void FahToCel(double temp){
        double result =  (temp-32)*(5/9);
        System.out.println(temp+"°F = "+result+"°C");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number equivalent of the conversion : ");
        System.out.println("1. Celcius to Fahrenheit.");
        System.out.println("2. Fahrenheit to Celcius.");
        System.out.print("Enter : ");
        int choice = input.nextInt();

        System.out.print("Enter the Temperature : ");
        double temp = input.nextDouble();

        switch(choice){
          case 1 :CelToFah(temp); break;
          case 2 : FahToCel(temp); break;
          default : System.out.println("Invalid Choice or Something went wrong!");
        }

    }
}