package main;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

// Class representing an image that implements Displayable
public class Image implements Displayable {
    private BufferedImage bufferedImage;

    private int width;
    private int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;

        this.bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    }

    public void save(String filename) {
        try {

            // Determine file format from extension
            String format = "png"; // default
            if (filename.toLowerCase().endsWith(".jpg") || filename.toLowerCase().endsWith(".jpeg")) {
                format = "jpg";
            }

            // Save the image
            File outputFile = new File(filename);
            ImageIO.write(bufferedImage, format, outputFile);
            System.out.println("Image saved successfully as: " + filename);

        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }
    }

    // Method to display a pixel with color
    public void display(int x, int y, Color color) {
        
    }

    // Method to get the width of the image
    public int getWidth() {
        return this.width;
    }

    // Method to get the height of the image
    public int getHeight() {
        return this.height;
    }
}
