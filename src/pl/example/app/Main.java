package pl.example.app;

import pl.example.data.Triangle;

import pl.example.data.Triangle;

public class Main {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(8,10,6);
        RightTriangle rt = new RightTriangle();
        boolean czyProstokatny1 = rt.isRightTriangle(triangle1);
        System.out.println(czyProstokatny1);
        rt.showInfo(triangle1);

        Triangle triangle2 = new Triangle(8,12,6);
        boolean czyProstokatny2 = rt.isRightTriangle(triangle2);
        System.out.println(czyProstokatny2);
        rt.showInfo(triangle2);
    }
}
