import java.util.ArrayList;
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