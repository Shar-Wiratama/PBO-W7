package Tugas2;

public class Circle extends Shape{
private double radius;
	//constructor circle 1
	public Circle() {
		super();
		setRadius(1.0);
	}
        //constructor circle 2
	public Circle(double radius) {
		super();
		this.setRadius(radius);
	}
        //constructor circle 3
	public Circle(double radius,String color,boolean filled) {
		super(color,filled);
		this.setRadius(radius);
	}
        //return radius
	public double getRadius() {
		return radius;
	}
        //set the radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
       //return the formula of area for circle
	public double getArea() {
		return radius*radius*Math.PI;
	}
        //return the formula of pheriperal for circle
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
        //output for circle
	public String toString() {
		return "Circle["+super.toString()+", radius= "+radius+"]";
	}
}
