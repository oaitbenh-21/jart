package shapes;
import java.awt.Color;

// Class representing a circle
public class Circle implements Drawable {
    private int x;
    private int y;
    private int radius;
    private int width;
    private int height;

    // Constructor
    public Circle(Point center, int radius) {
        this.radius = radius;
        this.x = center.getX();
        this.y = center.getY();
    }

    // Static method to generate a random circle
    public static Circle random(int width, int height) {
        Point point = new Point(100, 200);
        Circle circle = new Circle(point, 100);
        circle.width = width;
        circle.height = height;
        return circle;
    }

    // Method to draw the circle on a displayable
    public void draw(Displayable displayable) {
    }

    // Method to get the color of the circle
    public Color getColor() {
        return new Color(1, 1, 1);
    }
}
