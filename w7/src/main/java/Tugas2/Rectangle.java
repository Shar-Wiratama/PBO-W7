package Tugas2;


public class Rectangle {
    private double width, length;
    public Rectangle(){
        super();
        width=1.0;
        length=1.0;
    }
    public Rectangle (double width, double length){
        super();
        this.width=width;
        this.length= length;
    }
    public Rectangle(double width, double length, boolean filled, String color){
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }
    public double isWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double isLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }
    @Override
    public String toString(){
        return "Rectangle["+super.toString()+" length "+length+ " width "+width+"]";
    }
}
