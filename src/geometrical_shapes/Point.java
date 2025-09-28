package geometrical_shapes;

import java.awt.Color;

public class Point {

    private int x;
    private int y;
    private Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = new Color(0, 0, 0);
    }

    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Point Random(int maxX, int maxY) {
        return new Point(
                (int) (Math.random() * maxX),
                (int) (Math.random() * maxY),
                new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
    }

    public void draw(Displayable displayable) {
        displayable.display(x, y, this.color);
    }
}