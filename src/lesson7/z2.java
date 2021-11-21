package lesson7;

import java.util.ArrayList;
import java.util.Arrays;

public class z2 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] { new Ball(8), new Pyramid(4, 2),
                new Cylinder(3, 3) };

        Box box = new Box(2500);

        for (Shape shape : shapes) {
            box.add(shape);
        }

        box.viewContent();
    }
}

class Box extends Shape {

    private double controlVolume;

    private ArrayList<Shape> shapes;

    public Box(double maxVol) {
        super.volume = maxVol;
        shapes = new ArrayList<>();
    }

    public void viewContent() {
        System.out.println(Arrays.toString(shapes.toArray()));
    }

    public boolean add(Shape shape) {
        controlVolume += shape.getVolume();

        if (controlVolume <= super.volume) {
            shapes.add(shape);
            return true;
        } else {
            System.out.println("Box volume exceeded. Couldn't put " + shape + " in the box.");
            return false;
        }
    }
}

class Shape {
    protected double volume;
    protected String name = "Shape";

    protected double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "'" + this.name +
                ", volume: " + volume + "'";
    }
}

class Pyramid extends Shape {
    private double baseArea;
    private double height;
    private final String name = "Pyramid";

    public Pyramid(double baseArea, double height) {
        super.name = name;
        this.baseArea = baseArea;
        this.height = height;
        super.volume = this.getVolume();
    }

    @Override
    public double getVolume() {
        return (baseArea * height) / 3;
    }
}

class SolidOfRevolution extends Shape {
    protected double radius;

    protected double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;
    private final String name = "Cylinder";

    public Cylinder(double radius, double height) {
        super.radius = radius;
        super.name = name;
        this.height = height;
        volume = this.getVolume();
    }

    @Override
    public double getVolume() {
        return height * Math.PI * Math.pow(radius, 2);
    }
}

class Ball extends SolidOfRevolution {
    private final String name = "Ball";

    public Ball(double radius) {
        super.radius = radius;
        super.name = name;
        volume = this.getVolume();
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
