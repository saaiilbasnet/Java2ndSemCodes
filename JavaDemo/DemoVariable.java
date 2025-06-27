public class DemoVariable {
    static String name = "Saaiil";
    String address = "Gatthaghar";

    public static void main(String[] args){

        System.out.println(DemoVariable.name); //class variable

        DemoVariable d1 = new DemoVariable(); //creating a instance

        System.out.println(d1.address); //object variable

    }

}
