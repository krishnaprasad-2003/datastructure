import Graphics.*;
public class GraphicsTest{
public static void main(String[]args){
Rectangle rectangle=new Rectangle(5,4);
System.out.println("Area of Rectangle:"+rectangle.area());
Triangle triangle=new Triangle(3,6);
System.out.println("Area of Triangle:"+triangle.area());
Square square=new Square(4);
System.out.println("Area of Square:"+square.area());
Circle circle=new Circle(3);
System.out.println("Area of Circle:"+circle.area());
}
}