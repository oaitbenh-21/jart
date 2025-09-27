package main;
import java.awt.Color;

// Class representing an image that implements Displayable
public class Image implements Displayable {
    private int width;
    private int height;
    // Constructor
    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Method to display a pixel with color
    public void display(int x, int y, Color color) {}

    // Method to save the image to a file
    public void save(String string) {}

    // Method to get the width of the image
    public int getWidth() {
        return this.width;
    }

    // Method to get the height of the image
    public int getHeight() {
        return this.height;
    }
}
