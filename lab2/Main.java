class Vector{
    private double X;
    private double Y;
    Vector(){
        X=0;
        Y=0;
    }
    Vector(double X,double Y){
        this.X=X;
        this.Y=Y;
    }
    double getX(){
        return X;
    }
    double getY(){
        return Y;
    }
    void setX(double x){
        X=x;
    }
    void setY(double y){
        Y=y;
    }
    double magnitude() {
        return Math.sqrt(X*X + Y*Y);
    }
    double angle(){
        return Math.atan2(Y,X);
    }
    void print(){
        if(Y>=0){
        System.out.println("( "+ X +" i + "+ Y +" j )");}
        else
        {System.out.println("( "+ X +" i - "+ -Y +" j )");}

        System.out.println( magnitude() + "  [ " + angle()+" ] rad" );
    }
    Vector add(Vector V){
        return new Vector( X + V.X , Y + V.Y );
    }
    Vector sub(Vector V){
        return new Vector( X - V.X , Y - V.Y );
    }

}
public class Main{
    static double Average(Vector [] array){
           double sum=0 ;
           if(array.length==0){
            return 0;
           }
           else{
            for(int i=0 ; i< array.length ;i++){
                sum += array[i].magnitude();
            }
            return sum/(array.length);
            }
        }
    public static void main(String[] args){
        Vector v1 = new Vector(2,5);
        Vector v2 = new Vector(-5,7.6);
        Vector v3 = new Vector(0.7,8.1);
        Vector v4 = new Vector();  // default constructor test

        v4.print();

        System.out.println(v1.getX());
        System.out.println(v1.getY());

        v1.setX(55);
        v1.setY(66);

        v1.print();

        System.out.println("The Second Vector's magnitude: "+ v2.magnitude());

        System.out.println("The Second Vector's Angle: "+ v3.angle()+ " rad");

        Vector[] vectors = {v1,v2,v3};
        
        System.out.println("Average Test: "+Average(vectors));

        v1.add(v2).print();
        v1.sub(v2).print();

        Vector v5 = new Vector(3, -66);
        v5.print();

    }
}
