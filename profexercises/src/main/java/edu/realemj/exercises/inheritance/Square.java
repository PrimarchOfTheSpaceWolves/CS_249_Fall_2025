package edu.realemj.exercises.inheritance;

public class Square extends Shape {
    private double side = 1.0;

    public Square() {}

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        String s = "Square (side = " + side + ")";
        s += " comes from ";
        s += super.toString();
        return s;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
