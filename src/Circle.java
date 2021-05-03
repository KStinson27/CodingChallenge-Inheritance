public class Circle {

    // 1. Write a class with the name Circle. The class needs one instance variable with name radius of type double.
    private double radius;
    //The class needs to have one constructor with parameter radius of type double and initialize the fields.
    //In case the radius parameter is less than 0 it needs to set the radius field value to 0.
    public Circle (double radius){
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    //Write the following methods (instance methods):
    //* Method named getRadius without any parameters, it needs to return the value of radius field.
    public double getRadius(){
        return this.radius;
    }
    //* Method named getArea without any parameters, it needs to return the calculated area
    public double getArea(){
        return (radius * radius * Math.PI);
    }



}
