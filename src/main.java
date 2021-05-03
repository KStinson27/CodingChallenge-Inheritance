public class main {
    public static void main(String[] args){

        System.out.println("********Circle***********");

        Circle circle = new Circle(3.75);
        System.out.println("Circle Radius = " + circle.getRadius());
        System.out.println("Circle Area = " + circle.getArea());

        System.out.println("********Cylinder***********");

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder Radius = " + cylinder.getRadius());
        System.out.println("Cylinder Height = " + cylinder.getHeight());
        System.out.println("Cylinder Area = " + cylinder.getArea());
        System.out.println("Cylinder Volume = " + cylinder.getVolume());

        System.out.println("*********Rectangle**********");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Width= " + rectangle.getWidth());
        System.out.println("Rectangle Length= " + rectangle.getLength());
        System.out.println("Rectangle Area= " + rectangle.getArea());

        System.out.println("********Cuboid***********");

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid Width= " + cuboid.getWidth());
        System.out.println("Cuboid Length= " + cuboid.getLength());
        System.out.println("Cuboid Area= " + cuboid.getArea());
        System.out.println("Cuboid Height= " + cuboid.getHeight());
        System.out.println("Cuboid Volume= " + cuboid.getVolume());


    }
}
