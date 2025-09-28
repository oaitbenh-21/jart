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
        Circle circle = new Circle(point, (int) (Math.random() * (width + height) / 2));
        circle.color = point.color;
        circle.width = width;
        circle.height = height;
        return circle;
    }

    // Method to draw the circle on a displayable
    public void draw(Displayable displayable) {
        int steps = 180 * radius;

        for (int i = 0; i < steps; i++) {
            double theta = (i * Math.PI) / steps;

            double x = this.center.getX() + radius * Math.cos(theta);
            double y = this.center.getY() + radius * Math.sin(theta);
            double minusY = this.center.getY() - radius * Math.sin(theta);

            int xPixel = (int) Math.round(x);
            int yPixel = (int) Math.round(y);
            int minusYPixel = (int) Math.round(minusY);

            displayable.display(xPixel, yPixel, color);
            displayable.display(xPixel, minusYPixel, color);
        }
    }

    // Method to get the color of the circle
    public Color getColor() {
        return this.color;
    }

    public Color setColor(int r, int g, int b) {
        return new Color(r, g, b);
    }

}
