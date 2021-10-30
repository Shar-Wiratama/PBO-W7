package Tugas2;

public class Square extends Rectangle{
	//constructor square 1
        public Square() {
		super();
	}
        //constructor square 2
	public Square(double side) {
		super(side,side);
	}
        //constructor square 3
	public Square(double side,String color,boolean filled) {
		super(side,side,color,filled);
	}
        //return side that inherit from length in rectangle.java
	public double getSide() {
		return super.getLength();
	}
        //set the side from rectangle.java
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
        //output for square
	public String toString() {
		return "Square["+super.toString()+"]";
	}
}
