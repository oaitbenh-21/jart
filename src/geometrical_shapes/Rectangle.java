package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    protected Point x;
    protected Point y;
    protected Color color;

    public Rectangle(Point x, Point y) {
        this.x = x;
        this.y = y;
        this.color = new Color(0, 0, 0);
    }

    public void draw(Displayable displayable) {
        Point p1 = x;
        Point p2 = new Point(y.getX(), x.getY(), this.color);
        Point p3 = y;
        Point p4 = new Point(x.getX(), y.getY(), this.color);
        Line line = new Line(p1, p2);
        line.draw(displayable);
        line = new Line(p2, p3);
        line.draw(displayable);
        line = new Line(p3, p4);
        line.draw(displayable);
        line = new Line(p4, p1);
        line.draw(displayable);
    }

    public Color getColor() {
        return new Color(1, 1, 1);
    }

}
