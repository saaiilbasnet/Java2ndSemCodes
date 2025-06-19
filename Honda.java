class Honda extends Bike {
    @Override
    void run(){
        System.out.println("Running safely");
    }

    public static void main(String[] args){
            Bike obj = new Honda();
            obj.run();
    }
    
}