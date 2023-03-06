package rikkei.academy2;

import rikkei.academy.Circle;

public class TestCircle extends Circle {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        TestCircle testCircle2 = new TestCircle();

        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + testCircle2.getArea());
    }
}
