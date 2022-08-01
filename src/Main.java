import rikkei.Circle;
import rikkei.Cylinder;

public class Main {
    public static void main(String[]args){
        Circle circle = new Circle(2.0,"red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5.0);
        cylinder.setRadius(circle.getRadius());
        System.out.println(circle.toString());

    }
}
