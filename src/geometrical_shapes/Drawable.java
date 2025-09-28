package geometrical_shapes;
import java.awt.Color;

// Interface for drawable shapes
public interface Drawable {
    // Method to draw the shape using a Displayable
    void draw(Displayable displayable);

    // Method to get the color of the shape
    Color getColor();
}
