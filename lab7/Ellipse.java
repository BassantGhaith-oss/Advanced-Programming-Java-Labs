class Ellipse extends Shape implements Moveable, Comparable<Ellipse>{    //no couldn't be abstract class
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
       System.out.println("Start: [ X: " + this.getStart().getX()+" , Y: "+this.getStart().getY()+" ]");
       System.out.println("Length = " + this.l);
       System.out.println("width = " + this.w);
    }
    public void move(double dx, double dy) {
        getStart().setLocation(
            getStart().getX() + dx,
            getStart().getY() + dy
        );
    }
     public int compareTo(Ellipse other) {
        return Double.compare(
            this.l * this.w,
            other.l * other.w
        );
    }
}
