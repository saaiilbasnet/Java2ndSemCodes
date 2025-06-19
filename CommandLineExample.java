public class CommandLineExample {
    public static void main(String[] args){ //string array
        
        if(args.length == 0){
            System.out.println("No arguements passed.");
        }
        else{
            for(String arg : args){  //object array //
                System.out.println(arg);
            }
        }
    }
}
