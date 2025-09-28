package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    private Point x;
    private Point y;
    private Color color;

    public Line(Point x, Point y) {
        this.x = x;
        this.y = y;
        this.color = Color.WHITE;
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

    public Line random(int width, int height) {
        Line line = new Line(Point.Random(width, height), Point.Random(width, height));
        line.color = Point.Random(width, height).getColor();
        return line;
    }

    public Color getColor() {
        return this.color;
    }
}
