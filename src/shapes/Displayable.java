// Interface for objects that can be displayed
public interface Displayable {
    // Method to display an element at given coordinates with a specific color
    void display(int x, int y, Color color);

    // Method to save the display to a file
    void save(String string);
}
