package com.cybertek.lamda.shape;

import javafx.scene.shape.Circle;

public class ShapeTest {

    public static void main(String[] args) {
        Drawable drawable = () -> System.out.println("Drawing a circle");
        drawable.draw();

        Drawable2 drawable2 = (shape) -> System.out.println("Drawing a "+shape);
        drawable2.draw("Triangle");

        Drawable2 drawable22 = shape -> System.out.println("Drawing a "+shape);
        drawable22.draw("Ractange");

        Drawable3 drawable3 = (shape, name) -> System.out.println(name + " is drawing a " + shape);
        drawable3.draw("circle", "Sara");

        Drawable4 drawable4 = (shape, area) -> "Drawing a " +shape + " and it's area is " +area;
        System.out.println(drawable4.draw("Circle", 4));

        Drawable3 drawable31 = (shape, name) -> {
            System.out.println("name is  " + name);
            System.out.println("shape is  " + shape);
        };
        drawable31.draw("circle", "Sara");
    }
}
