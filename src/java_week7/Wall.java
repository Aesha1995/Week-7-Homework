package java_week7;

/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * * Method named getWidth without any parameters, it needs to return the value of width field.
 * * Method named getHeight without any parameters, it needs to return the value of height field.
 * * Method named setWidth with one parameter of type double, it needs to set the value of the width
 * field. If the parameter is less than 0 it needs to set the width field value to 0.
 * * Method named setHeight with one parameter of type double, it needs to set the value of the
 * height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * * Method named getArea without any parameters, it needs to return the area of the wall.
 * TEST EXAMPLE
 * → TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT)
 * Wall wall = new Wall (5, 4);
 * System.out.println("area= " + wall.getArea());
 * wall.setHeight(-1.5);
 * System.out.println("width= " + wall.getWidth());
 * System.out.println("height= " + wall.getHeight());
 * System.out.println("area= " + wall.getArea());
 * → OUTPUT:
 * area= 20.0
 * width= 5.0
 * height= 0.0
 * area= 0.0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 5 methods and 2 constructors.
 */
public class Wall
{
    double width,height; // declring instance variables
    public static void main(String[] args) // declaring main method
    {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea()); // output the area of the wall
        wall.setHeight(-1.5); // setting the height value to -1.5
        System.out.println("width= " + wall.getWidth()); // calling instance  method
        System.out.println("height= " + wall.getHeight()); // calling instance method
        System.out.println("area= " + wall.getArea()); // calling instance method
    }
    public Wall(){} //declaring constructor with no arguments
    public Wall(double width, double height) // declaring constructor with parameter
    {
        if (width < 0) {
            width = 0;
        } else if (height < 0) {
            height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    public double getWidth() // declaring instance method
    {
        return width;
    }
    public double getHeight() //declaring instance method
    {
        return height;
    }
    public void setWidth(double width) //instance method
    {
        if (width<0)
        {
            width=0;
        }
        this.width = width;
    }
    public void setHeight(double height) //instance method
    {
        if (height<0)
        {
            height=0;
        }
        this.height = height;
    }
    public double getArea() // instance method
    {
        double area = height*width;
        return area;
    }
}