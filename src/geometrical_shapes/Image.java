package geometrical_shapes;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.io.File;
import java.io.IOException;

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
            String format = "png";
            if (filename.toLowerCase().endsWith(".jpg") || filename.toLowerCase().endsWith(".jpeg")) {
                format = "jpg";
            }
            File outputFile = new File(filename);
            ImageIO.write(bufferedImage, format, outputFile);
            System.out.println("Image saved successfully as: " + filename);
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }
    }

    public void display(int x, int y, Color color) {
        Graphics g = bufferedImage.getGraphics();
        g.setColor(color);
        g.fillOval(x - 1, y - 1, 2, 2);
        g.dispose();
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
