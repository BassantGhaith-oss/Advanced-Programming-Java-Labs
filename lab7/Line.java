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
        System.out.println("Start: [ X: " + this.getStart().getX()+" , Y: "+this.getStart().getY()+" ]");
        System.out.println("End: [ X: " + this.getStart().getX()+" , Y: "+this.getStart().getY()+" ]");

    }
}