package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        System.out.println("rectangle ga method");

        return this.length * this.width;
    }

    public double getPerimeter() {
        System.out.println("rectangle gp method");

        return 2*this.length + 2*this.width;
    }
}
