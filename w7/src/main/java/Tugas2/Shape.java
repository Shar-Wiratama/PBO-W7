package Tugas2;

public class Shape {
	private String color;
	private boolean filled;
	//Constructor shape 1
	public Shape() {
		color = "green";
		filled = true;
	}
        //Constructor shape 2
	public Shape(String color,boolean filled) {
		this.color = color;
		this.filled = filled;
	}
        //Returns the filled
	public boolean isFilled() {
		return filled;
	}
        //set for filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}	
        //Returns for the color
	public String getColor() {
		return color;
	}
        //set for color
	public void setColor(String color) {
		this.color = color;
	}
        //output for shape
	public String toString() {
		return "Shape[color= "+color+", filled="+filled + "]";
	}
}
