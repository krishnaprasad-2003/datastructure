interface Shape{
double area();
double perimeter();
}
class Circle implements Shape{
double radius;
Circle(double radius){
this.radius=radius;
}
public double area(){
return Math.PI*radius*radius;
}
public double perimeter(){
return 2*Math.PI*radius;
}
}
class Rectangle implements Shape{
double length,width;
Rectangle(double length,double width){
this.length=length;
this.width=width;
}
public double area(){
return length*width;
}
public double perimeter(){
return 2*(length+width);
}
}
public class Main{
public static void main(String[] args){
Circle circle=new Circle(5);
Rectangle rectangle =new Rectangle(4,6);
System.out.println("Area of Circle:"+circle.area());
System.out.println("perimeter of Circle:"+circle.perimeter());
System.out.println("Area of Rectangle:"+rectangle.area());
System.out.println("perimeter of Rectangle:"+rectangle.perimeter());
}
}