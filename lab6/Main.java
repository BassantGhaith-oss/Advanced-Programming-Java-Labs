import java.util.ArrayList;
abstract class Shape{   // yes could be abstract class
    private Point2D start;
    public Shape(Point2D start){
        this.start=start;
    }
    abstract void draw();  
    public Point2D getStart(){
        return start;
    }
}
// however constructors couldn't be abstract nor final
class Point2D{
    private double x;
    private double y;
    public Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
class Line extends Shape{  //no prefer to be concrete class not abstract so that we can creat objects from it
    private Point2D end;
    public Line(Point2D start,Point2D end){
        super(start);
        this.end=end;
    }
    public Point2D getEnd(){
        return end;
    }
    public void draw(){
        System.out.println("Drawing Line");
        System.out.println("Start " + this.getStart());
        System.out.println("End " + this.end); 

    }
}
class Rectangle extends Shape{  //no prefer to be concrete class not abstract so that we can creat objects from it
    private double l; 
    private double w;
    public Rectangle(Point2D start,double l,double w){
        super(start);
        this.l=l;
        this.w=w;
    }
    public double getL(){return l;}
    public double getW(){return w;}
    public void draw(){
        System.out.println("Drawing Rectangle");
        System.out.println("Start " + this.getStart());
        System.out.println("Length = " + this.l);
        System.out.println("Width = " + this.w);
    }
}
class Ellipse extends Shape{    //no couldn't be abstract class
    private double l;
    private double w;
    public Ellipse(Point2D start,double l,double w){
        super(start);
        this.l=l;
        this.w=w;
    }
    public double getL(){
        return l;
    }
    public double getW(){
        return w;
    }
    public void draw(){
       System.out.println("Drawing Ellipse");
       System.out.println("Start " + this.getStart());
       System.out.println("Length = " + this.l);
       System.out.println("width = " + this.w);
    }
}
class Canvas{
    private ArrayList<Shape> shapes = new ArrayList<>();
    void addShape(Shape s){
        shapes.add(s);
    }
    public void drawAll(){
        for(Shape s:shapes){
            s.draw();
        }
    }
    boolean removeShape(Shape s){
        return shapes.remove(s);
    }
    Shape getShape(Point2D point){
        Shape closest = null; // we cann't use access modifier as public or private with local variables
        double distance = Double.MAX_VALUE; //starting from the highest possible value
        for(Shape s:shapes){
            double dis =Math.sqrt( Math.pow((point.getX() - s.getStart().getX()),2) + Math.pow(point.getY() - s.getStart().getY(),2) );
            if(dis <= distance){
                distance = dis;
                closest = s;
            }
        }
        return closest;
    }
}

public class Main{
    public static void main (String[] args){
        Canvas c = new Canvas();
        Shape[] shapes = {
            new Line(new Point2D(0, 0), new Point2D(5, 5)),
            new Line(new Point2D(-2, -2), new Point2D(5, 5)),
            new Line(new Point2D(-2, 0), new Point2D(0, 2)),
            new Rectangle(new Point2D(0, 0), 5, 5),
            new Rectangle(new Point2D(1, 1), 3, 2.5),
            new Rectangle(new Point2D(-1, 3), 2, 2),
            new Ellipse(new Point2D(0, 0), 5, 3.5),
            new Ellipse(new Point2D(2, 3), 3, 7),
            new Ellipse(new Point2D(10, 10), 3, 3.5)
        };
        for(Shape s: shapes){
            c.addShape(s);
        }
        // Will not remove, same values but diƯerent address.
        System.out.println(c.removeShape(new Line(new Point2D(0, 0), new Point2D(5, 5))));
        // Will remove, same address.
        System.out.println(c.removeShape(shapes[0]));
        c.getShape(new Point2D(2.5, 2.5)).draw();
        c.drawAll(); 

    }
}
/*
Question 1 Answer
-------------------------------------------------
class A {
public void f1(){
   System.out.println("A.f1 called");
} 
public final void f2() {  # we can not override the mathod
   System.out.println("A.f2 called");
}
public abstract void f3();  // the class had to been defined as abstract
                            // the abstract class have to be defined in the next class before the end of concrete class
}

class B extends A {
public void f1() {
super.f1();
System.out.println("B.f1 called");
}
public void f2() {
super.f2();                         // mistake becuase f2 is defined as final method so we cann't ovveride it
System.out.println("B.f2 called");  // to solve this problem we should remove  final
}
public void f3() {
System.out.println("B.f3 called");
}
}

class C extends A {  // we have to define f3 and its defining or to be abstract class
public void f1() {
super.f1();
System.out.println("C.f1 called");
}
}

abstract class D extends C {  // doesn't have to be adstract (no need)
public void f3() {
System.out.println("D.f3 called");
}
}

final class E extends D {   // this class we can not inherit from
}

class F extends E {    // error we cann't inherit from final class
public void f3() {
super.f3();
System.out.println("F.f3 called");
}
}

public class Test {
public static void main(String[] args) {
A[] ps = new A[6];  
ps[0] = new A();
ps[1] = new B(); 
ps[2] = new C(); 
ps[3] = new D(); // we cann't make an object from abstract class directly
ps[4] = new E();
ps[5] = new F();
*/
