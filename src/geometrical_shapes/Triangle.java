package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {
    protected Point x;
    protected Point y;
    protected Point z;
    protected Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.x = p1;
        this.y = p2;
        this.z = p3;
        this.color = new Color(32);
    }

    public void draw(Displayable displayable) {
        Line line = new Line(this.x, this.y);
        line.draw(displayable);
        line = new Line(this.y, this.z);
        line.draw(displayable);
        line = new Line(this.z, this.x);
        line.draw(displayable);
    }

    public Color getColor() {
        return new Color(1, 1, 1);
    }
}
