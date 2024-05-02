interface Shape {
    double calculateArea();
}

abstract class Polygon implements Shape {
    private int sides;

    public Polygon(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public abstract String getType();
}

class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}

class Square extends Polygon {
    private double side;

    public Square(double side) {
        super(4);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getType() {
        return "Square";
    }
}

public class Main {
    public static void main(String[] args) {
        Polygon triangle = new Triangle(3, 4);
        Polygon square = new Square(5);

        System.out.println(triangle.getType() + " Area: " + triangle.calculateArea());
        System.out.println(square.getType() + " Area: " + square.calculateArea());
    }
}
