package Tugas2;


public class Rectangle extends Shape {
	private double width;
	private double length;	
        //Constructor rectangle 1
	public Rectangle() {
		super();
		width = 1.0;
		length = 1.0;
	}
        //Constructo rectangle 2
	public Rectangle(double width,double length) {
		super();
		this.width = width;
		this.length = length;
	}
        //Constructor rectangle 3
	public Rectangle(double width,double length,String color,boolean filled) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}
        //return width
	public double getWidth() {
		return width;
	}
        //set width
	public void setWidth(double width) {
		this.width = width;
	}
        //return length
	public double getLength() {
		return length;
	}
        //set length
	public void setLength(double length) {
		this.length = length;
	}	
        //to return formula of area for rectangle
	public double getArea() {
		return width*length;
	}
        //to return formula of peripheral for rectangle
	public double getPerimeter() {
		return (width+length)*2;
	}
        //output for rectangle
	public String toString() {
		return "Square[Rectangle[ "+super.toString()+",width= "+width+", length= "+ length+"]";
	}
}
