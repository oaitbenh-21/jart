package geometrical_shapes;

import java.awt.Color;

// Class representing a circle
public class Circle implements Drawable {
    protected Point center;
    protected Color color;
    protected int radius;
    protected int width;
    protected int height;

    // Constructor
    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCPoint() {
        return center;
    }

    // Static method to generate a random circle
    public static Circle random(int width, int height) {
        Point point = Point.Random(width, height);
        Circle circle = new Circle(point, (int) (Math.random() * (width + height) / 6));
        circle.width = width;
        circle.height = height;
        return circle;
    }

    // Method to draw the circle on a displayable
    public void draw(Displayable displayable) {
    }

    // Method to get the color of the circle
    public Color getColor() {
        return this.color;
    }

    public Color setColor(int r, int g, int b) {
        return new Color(r, g, b);
    }

}
