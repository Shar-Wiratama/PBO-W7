package Tugas2;

public class Circle {
    private double radius;
    
    public Circle(){
        super();
        setRadius(1.0);
    }
    public Circle(double radius){
        super();
        this.setRadius(radius);
    }
    public Circle(double radius, boolean filled, String color){
        super(color,filled);
        this.setRadius(radius);
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "Circle[ "+super.toString()+", radius= "+radius+"]";
    }
}
