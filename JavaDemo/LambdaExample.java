import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // for(String s : list){
        //     System.out.println(s);
        // }

        list.forEach((s)->{
            System.out.println(s);
        });

    }
}
