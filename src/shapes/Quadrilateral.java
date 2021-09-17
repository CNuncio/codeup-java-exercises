package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;
    protected double side;
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
