package pl.example.app;

import pl.example.data.Triangle;

public class RightTriangle {

    boolean isRightTriangle(Triangle triangle) {
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();

        if (a > b && a > c) {
            return a * a == b * b + c * c;
        } else if (b > a && b > c) {
            return b * b == a * a + c * c;
        } else
            return c * c == a * a + b * b;

    }

    void showInfo(Triangle triangle) {
        System.out.print("Tójkat o bokach: " + triangle.getA() + ", " + triangle.getB() + ", " + triangle.getC());

        if(isRightTriangle(triangle)){
            System.out.println(" jest prostokątny.");
        }else
            System.out.println(" nie jest prostokątny.");
    }
}


