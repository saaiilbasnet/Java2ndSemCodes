public class ArrayAvg{
    public static void main(String[] args){
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12, -100, 234};
        float sumvar = 0;
        for(int i = 0; i < numbers.length; i++){
           sumvar = numbers[i] + sumvar;
        }

        float average = sumvar /(numbers.length);

        System.out.println("Average : " + average);
        
    }
}


// import java.util.Scanner;
// public class ArrayDemo {
//     public static void main(String[] args) {
//         int[] a; //creating a array class
//          a = new int [5] ; //intantation of the class
//         Scanner input = new Scanner(System.in);

//         // System.out.println(a.length);

//         // taking mannual user input
//         for(int i = 0; i < 5; i++){
//             System.out.println("Enter a["+i+"]: ");
//             a[i] = input.nextInt();
//         }

//         // displaying the stored array
//         for(int i = 0; i < 5; i++){
//             System.out.println(a[i]);
          
//         }

//     }
// }
