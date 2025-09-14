/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Drawable drawableCircle = (Drawable) circle;
        Drawable drawableRectangle = (Drawable) rectangle;

        System.out.println("Circle Area: " + circle.getArea());
        drawableCircle.draw();

        System.out.println("Rectangle Area: " + rectangle.getArea());
        drawableRectangle.draw();
    }
}
