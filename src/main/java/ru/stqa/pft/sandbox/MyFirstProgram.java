package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello, world");

        Square square = new Square(5);
        System.out.println("Area square with side " + square.l + " = " + square.area());

        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("Area rectangle with sides " + rectangle.a + " and " + rectangle.b + " = " + rectangle.area());
    }




}