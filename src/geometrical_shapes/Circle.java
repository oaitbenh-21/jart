package geometrical_shapes;

import java.awt.Color;

public class Circle implements Drawable {
    private Point center;
    private Color color;
    private int radius;

    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public static Circle random(int width, int height) {
        Point point = Point.Random(width, height);
        Circle circle = new Circle(point, (int) (Math.random() * (width + height) / 2));
        circle.color = point.getColor();
        return circle;
    }

    public Point getCPoint() {
        return center;
    }

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

    public Color getColor() {
        return this.color;
    }

}
