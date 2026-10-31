class Square {
    private double side ;
    Square(double side){
        this.side = side ;
    }
    double area(){
        return side * side;
    }
    double perimeter(){
        return 4 * side;
    }
    double getSide(){
        return side;
    }
}

class Circle{
    private double radius ;
    Circle (double radius){
        this.radius = radius ;
    }
    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
    double getRadius(){
        return radius;
    }
}
class Rectangle{
    private double length ;
    private double width ;
    Rectangle(double length, double width){
        this.length = length ;
        this.width = width ;
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }
    double getLength(){
        return length;
    }
    double getWidth(){
        return width;
    }

}
    // The Fifth Question Answer
    class Array{
    private int [] array ;
    Array(int[] array){
        this.array = array;
    }
    int summation(){
        int sum = 0;
        for(int i=0 ; i< array.length ; i++){
            sum += array[i];
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {

    // The First Question Answer
    Rectangle r1 = new Rectangle( 5.5,4);
    Square s1 = new Square(10);
    Circle c1 = new Circle( 3.2);

    System.out.println("The Rectangle's Area: "+r1.area()+" m2");
    System.out.println("The Rectangle's Dimensions: "+r1.getLength()+" m, "+r1.getWidth()+" m");
    System.out.println("The Rectangle's Perimeter: "+r1.perimeter()+" m");

    System.out.println("The Square's Area: "+s1.area()+" m2");
    System.out.println("The Square's Dimensions: "+s1.getSide()+" m");
    System.out.println("The Square's Perimeter: "+s1.perimeter()+" m");

    System.out.println("The Circle's Area: "+c1.area()+" m2");
    System.out.println("The Circle's Dimensions: "+c1.getRadius()+" m");
    System.out.println("The Circle's Perimeter: "+c1.perimeter()+" m");

    /* 
   continue: Skips the current iteration and proceeds to the next iteration of the loop.
   break: Exits the loop completely.


       The Second Question Answer:
    the code loop for 10 times and doesn't execute the instruction on the even iterations
    so it will print the odd number space and the odd number square
    (1 1) (3 9) (5 25) (7 49) (9 81).

       The Third Question Answer:
    No output.
    */
     
    // The Fourth Question Answer
    for(int i=1 ; i<=5 ; i++){
        for(int j=0 ; j<i ; j++){
            System.out.print("*  ");
        }
        System.out.println();
    }

    // Test Question 5
    int[] y = {2,4,8,6};
    Array X = new Array(y);
    System.out.println(X.summation());
}
}
