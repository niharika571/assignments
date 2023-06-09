
abstract class Shape {
    abstract public void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        // Draw the rectangle
        System.out.println("Drawing a rectangle");
    }
}

class Line extends Shape {
    @Override
    public void draw() {
        // Draw the line
        System.out.println("Drawing a line");
    }
}

class Cube extends Shape {
    @Override
    public void draw() {
        // Draw the cube
        System.out.println("Drawing a cube");
    }
}

public class Assignment2Q5 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape line = new Line();
        line.draw();

        Shape cube = new Cube();
        cube.draw();
    }
}
