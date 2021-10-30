package Tugas1;

/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

// Constructors (overloaded)
/** Constructs a Circle instance with default value for radius and color */
public Circle() { // 1st (default) constructor
    radius = 1.0;
    color = "red";
}
public Circle(double r){
    radius = r;
    color = "red";
}
/** Constructs a Circle instance with the given radius and default color */
public Circle(double radius , String color) { //Giving parameter String c to define color
    this.radius = radius;// Add constructor this to define the radius
    this.color = color;//Add constructor this to define the color
}
/** Returns the radius */
public double getRadius() {
    return radius;
}
/** Returns the area of this Circle instance */
public double getArea() {
    return radius*radius*Math.PI;
}
/**Returns the color*/
public String getColor() {
    return color;
}
/**Set the color*/
public void setColor (String color){
    this.color = color;
}
/** Return a self-descriptive string of this instance in the form of
Circle[radius=?,color=?] */
public String toString() {
    return "Circle[radius=" + radius + " color=" + getColor() + "]";
    }
}