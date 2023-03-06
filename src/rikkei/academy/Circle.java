
//  UML    _________________________
//        |        Circle           |
//        |-------------------------|
//        | -radius: double = 1.0   |
//        | -color: String = "red"  |
//        |-------------------------|
//        | +Circle():              |
//        | +Circle(r:bouble)       |
//        | +getRadius(): double    |
//        | +getArea(): double      |
//        |                         |
//        |_________________________|

package rikkei.academy;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    //    private double getArea() {
//        return (radius*radius)*Math.PI;
//    }
//    double getArea() {
//        return (radius * radius) * Math.PI;
//    }
    protected double getArea() {
        return (radius*radius)*Math.PI;
    }
//    public double getArea() {
//        return (radius*radius)*Math.PI;
//    }
}
