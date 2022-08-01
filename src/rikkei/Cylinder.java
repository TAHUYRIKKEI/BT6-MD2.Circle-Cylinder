package rikkei;

public class Cylinder extends Circle{
private double height;


public Cylinder(double radius, String color , double height){
  super(radius,color);
  this.height=height;
}
public Cylinder(){}
    public double getVolume(){
    return this.height*super.getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{"+
                "height="+height+ "radius="+super.getRadius()+"Volume ="+getVolume()+'}';
    }
}

