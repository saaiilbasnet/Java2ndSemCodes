public class Circle {
    private  double radius;

    // constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //getter
     double getRadius(){
        return radius;
    }

    // setter

    public void setRadius(double radius){
        this.radius = radius;
    }

    //calculate method

    public double calculateArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        double area = myCircle.calculateArea();
        System.out.println("Area : "+area);

    }
}
