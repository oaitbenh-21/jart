package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    protected Point x;
    protected Point y;
    protected Color color;

    public Line(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Displayable displayable) {
        int dx = this.y.getX() - this.x.getX();
        int dy = this.y.getY() - this.x.getY();

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xInc = dx / (float) steps;
        float yInc = dy / (float) steps;

        float x = this.x.getX();
        float y = this.x.getY();

        for (int i = 0; i <= steps; i++) {
            Point p = new Point(Math.round(x), Math.round(y), this.color);
            p.draw(displayable);

            x += xInc;
            y += yInc;
        }
    }

    public Color getColor() {
        return this.color;
    }
}
