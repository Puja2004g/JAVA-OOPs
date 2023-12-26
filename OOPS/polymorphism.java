package OOPS;

//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two
// subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape.
// In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the
// total surface area of the cylinder.

import java.util.Scanner;

class Shape_1{
    void draw_1(){
        System.out.println("Draw shape");
    }
    void calculateArea(){
        System.out.println("Calculate area of any shape");
    }
}

class circleShape extends Shape_1{
    @Override
    void draw_1() {
        System.out.println("Draw circle");
    }
}

class cylinderShape extends Shape_1{
    @Override
    void draw_1() {
        System.out.println("Draw Cylinder");
    }
    void calculateArea(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double area = (2*Math.PI*r*h)+(2*Math.PI*r*r);
        System.out.println("Total surface area of the cylinder : "+area);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        circleShape ci = new circleShape();
        cylinderShape cy = new cylinderShape();

        ci.draw_1();
        cy.draw_1();
        cy.calculateArea();
    }
}
