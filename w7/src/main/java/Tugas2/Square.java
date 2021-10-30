package Tugas2;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled) {
		super(side,side,color,filled);
    }
    public double getSide() {
    	return super.getLength();
    }
    public void setSide(double side) {
	super.setLength(side);
	super.setWidth(side);
    }
    public double getArea(){
        return getSide()*getSide();
    }
    public double getPerimater(){
        return 4*getSide();
    }
    @Override
    public void setWidth(double side){
        if(super.setWidth(side)==super.setLength(side)){
            super.setWidth(side);
        }else{
            System.out.println("Can't be created because both side aren't same size");
        }
    }
    @Override
    public void setLength(double side){
        if(super.setWidth(side)==super.setLength(side)){
            super.setLength(side);
        }else{
            System.out.println("Can't be created because both side aren't same size");
        }
    }
    @Override
    public String toString() {
	return "Rectangle["+super.toString()+"side"+getSide()"]";
    }
}
