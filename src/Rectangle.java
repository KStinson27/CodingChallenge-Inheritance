//The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.

// 1. Write a class with the name Rectangle. The class needs two instance variables with name width and length both of type double.
public class Rectangle{

    private double width;
    private double length;

//The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
// In case the width parameter is less than 0 it needs to set the width field value to 0.
//In case the length parameter is less than 0 it needs to set the length field value to 0.

    public Rectangle(double width, double length){
        if (width < 0){
            width = 0;
        }
        this.width = width;

        if (length < 0){
            length = 0;
        }
        this.length = length;
    }

// Method named getWidth without any parameters, it needs to return the value of width field.

    public double getWidth(){
        return this.width;
    }
// Method named getLength without any parameters, it needs to return the value of length field.

    public double getLength(){
        return this.length;
    }
// Method named getArea without any parameters, it needs to return the calculated area (width * length).

    public double getArea(){
        return (width * length);
    }

}
