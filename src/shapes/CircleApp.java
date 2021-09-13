package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
//        String prompt = "Eneter radius of circle";
        Input input = new Input();
        double radius = input.getDouble("Enter radius of circle: ");
        Circle circle  = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("Are of the circle is %.f and its circumference is %.2f%n", area, circumference);
    }
}
