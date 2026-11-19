class Rectangle extends Shape implements Moveable , Comparable<Rectangle>{  //no prefer to be concrete class not abstract so that we can creat objects from it
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
        System.out.println("Start: [ X: " + this.getStart().getX()+" , Y: "+this.getStart().getY()+" ]");
        System.out.println("Length = " + this.l);
        System.out.println("Width = " + this.w);
        System.out.println();
    }
    public void move(double dx, double dy) {
        getStart().setLocation(
            getStart().getX() + dx,
            getStart().getY() + dy
        );
    }
    public int compareTo(Rectangle other) {
        return Double.compare(
            this.l * this.w,
            other.l * other.w
        );
    }
}