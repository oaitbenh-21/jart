package geometrical_shapes;

import java.awt.Color;

// Class representing a triangle
public class Triangle implements Drawable {
    protected Point x;
    protected Point y;
    protected Point z;
    protected Color color;

    // Constructor
    public Triangle(Point p1, Point p2, Point p3) {
        this.x = p1;
        this.y = p2;
        this.z = p3;
        this.color = new Color(32);
    }

    // Method to draw the triangle on a displayable
    public void draw(Displayable displayable) {
        Line line = new Line(this.x, this.y);
        line.draw(displayable);
        line = new Line(this.y, this.z);
        line.draw(displayable);
        line = new Line(this.z, this.x);
        line.draw(displayable);
    }

    // Method to get the color of the triangle
    public Color getColor() {
        return new Color(1, 1, 1);
    }

    public void setColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
    }
}
