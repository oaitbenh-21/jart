package shapes;
import java.awt.Color;

// Class representing a rectangle
public class Rectangle implements Drawable {
    private Point x;
    // Constructor
    public Rectangle(Point topLeft, Point bottomRight) {}

    // Method to draw the rectangle on a displayable
    public void draw(Displayable displayable) {
        this.x = new Point(0, 0);
    }

    // Method to get the color of the rectangle
    public Color getColor() {
        return new Color(1, 1, 1);
    }
}
