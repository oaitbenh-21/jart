# jart

A Java project for creating and manipulating geometric shapes to generate images.

---

## Project Structure

├── main\
│   └── Main.java\
└── src\
    ├── model\
    │   ├── Image.java\
    │   └── Point.java\
    └── shapes\
        ├── Circle.java\
        ├── Displayable.java\
        ├── Drawable.java\
        ├── Rectangle.java\
        └── Triangle.java

4 directories, 8 files

---

## Description

The **jart** project is designed to create an image composed of various geometric shapes such as rectangles, triangles, and circles. The shapes can be drawn, displayed, and saved using custom interfaces and classes.

The purpose of this exercise is to implement the logic for creating and manipulating these shapes and to generate an image like the example shown in the usage.

---

## Features

- Define and implement the following interfaces:
  - `Drawable` - containing methods `draw(Displayable displayable)` and `getColor()`.
  - `Displayable` - containing methods `display(int x, int y, Color color)` and `save(String filename)`.
  
- Implement the following shapes with constructors and methods:
  - `Point` - initialized with two integer coordinates.
  - `Line` - initialized with two distinct points.
  - `Triangle` - initialized with three distinct points.
  - `Rectangle` - initialized with two points.
  - `Circle` - initialized with a center point and a radius.
  
- Implement `random` methods for `Line`, `Point`, and `Circle` to create random instances within given bounds.

---

## Usage

```java
interface Displayable {
    void display(int x, int y, Color color);
    void save(String string);
}

interface Drawable {
    void draw(Displayable displayable);
    Color getColor();
}

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);

        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }
        image.save("image.png");
    }
}
