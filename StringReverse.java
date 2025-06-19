
public class StringReverse{

    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Invalid String!");
            return;
        }

        String input = args[0];

        //using string builder's reverse method

        String reverse = new StringBuilder(input).reverse().toString();

        System.out.println("Original : "+input);
                System.out.println("Reverse : "+reverse);
        
    }

}