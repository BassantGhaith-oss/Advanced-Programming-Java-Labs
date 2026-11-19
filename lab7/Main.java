import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        // Question 1

        Rectangle r1 = new Rectangle(
            new Point2D(1, 2), 5, 4
        );

        Rectangle r2 = new Rectangle(
            new Point2D(3, 4), 3, 6
        );

        r1.draw();
        r2.draw();

        r1.move(2, 3);
        r2.move(5, 5);

        System.out.println("After Moving:");
        r1.draw();

        System.out.println("Comparison: " + r1.compareTo(r2) + "  is the greater Rectangle ");

        // Question 2

        Rectangle[] rectangles = {
            new Rectangle(new Point2D(1, 1), 5, 4),
            new Rectangle(new Point2D(2, 2), 2, 3),
            new Rectangle(new Point2D(3, 3), 6, 5)
        };

        Arrays.sort(rectangles);

        System.out.println("\nSorted Rectangles:");

        for (Rectangle r : rectangles) {
            r.draw();
        }

        // Question 3

        Moveable[] moveables = {
            new Rectangle(new Point2D(1, 1), 4, 5),
            new Ellipse(new Point2D(2, 2), 3, 4),
            new Rectangle(new Point2D(3, 3), 2, 2),
            new Ellipse(new Point2D(4, 4), 5, 6)
        };

        for (Moveable m : moveables) {
            m.move(2, 2);
        }

        System.out.println("\nMoveables after Moving:");

        for (Moveable m : moveables) {
            ((Shape) m).draw();
        }

        try {
            Arrays.sort(moveables);
            System.out.println("Sorted successfully.");
        }
        catch (ClassCastException e) {
            System.out.println("Cannot sort different types of Moveables.");
        }

        // Question 4

        Shape[] shapes = {
            new Rectangle(new Point2D(1, 2), 4, 5),
            new Ellipse(new Point2D(3, 4), 6, 3),
            new Line(
                new Point2D(5, 6),
                new Point2D(8, 9)
            )
        };

        for (Shape s : shapes) {

            if (s instanceof Moveable) {
                ((Moveable) s).move(2, 3);
            }

            s.draw();
        }
    }
}