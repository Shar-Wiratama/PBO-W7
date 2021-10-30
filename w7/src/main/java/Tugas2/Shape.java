package Tugas2;


public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color =  "green";
        filled = true;
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void setFilled(){
        this.filled=filled;
    }
    public boolean isFilled(){
        return filled;
    }
     public void setColor(){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
    if(isFilled()==0){
        return "A shape with color "+this.color+ " and filled";
    }else{
        return "Shape[color= "+color+" filled="+filled+"]";
    }
    
}
