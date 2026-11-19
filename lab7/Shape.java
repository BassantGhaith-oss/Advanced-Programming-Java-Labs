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