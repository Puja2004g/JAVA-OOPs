package OOPS;
//Write a Java program to create an interface Shape with the getArea(), draw() method. Create three classes Rectangle, Circle, and Triangle that
// implement the Shape interface. Implement the getArea() method for each of the three classes.

import java.util.Scanner;

interface shape{
    void getArea();
    void draw();
}

class rectangle implements shape{
    public void draw(){
        System.out.println("Draw Rectangle");
    }
    public void getArea(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("Area of rectangle : " + area);
    }

}

class circle implements  shape{
    public void draw(){
        System.out.println("Draw Circle");
    }
    public void getArea(){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = Math.PI * radius;
        System.out.println("Area of circle : " + area);
    }
}

class triangle implements shape{
    public void draw(){
        System.out.println("Draw Triangle");
    }

    public void getArea(){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle : " + area);
    }
}


public class interfaces {
    public static void main(String[] args) {
        rectangle objr = new rectangle();
        circle objc = new circle();
        triangle objt = new triangle();

        objr.draw();
        objr.getArea();

        objc.draw();
        objc.getArea();

        objt.draw();
        objt.getArea();
    }
}
