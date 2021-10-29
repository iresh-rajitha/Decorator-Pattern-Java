package com.ireshrajitha;

import com.ireshrajitha.shape.Circle;
import com.ireshrajitha.shape.Rectangle;
import com.ireshrajitha.shape.Shape;

public class main {
    public static void main(String[] args) {
        System.out.println("Normal Circle");
        Shape normalCircle = new Circle();
        normalCircle.draw();

        System.out.println("\nCircle decorate with green border ");
        Shape greecircle = new GreenBorderDecorator(normalCircle);
        greecircle.draw();

        System.out.println("\nDecorate new rectangle");
        Shape greenRect = new GreenBorderDecorator(new Rectangle());
        greenRect.draw();
    }
}
