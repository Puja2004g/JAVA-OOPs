package OOPS;

//Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle
// and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.

import java.util.Scanner;

abstract class GeometricShape{
    abstract void area();
    abstract void perimeter();
}

class square extends GeometricShape{
    int side;

    void getdetails(){
        Scanner sc = new Scanner(System.in);
        this.side = sc.nextInt();
    }

    void area(){
        int area = this.side * this.side;
        System.out.println("Area of triangle: " + area);
    }

    void perimeter(){
        int per = 4*this.side;
        System.out.println("Perimeter of triangle: " + per);
    }

}

class TriangleShape extends GeometricShape{
    int base, height;

    void getdetails(){
        Scanner sc = new Scanner(System.in);
        this.base = sc.nextInt();
        this.height = sc.nextInt();
    }
    void area(){
        int area = this.base * this.height;
        System.out.println("Area of triangle: " + area);
    }

    void perimeter(){
        int per = (this.base+this.height)*2;
        System.out.println("Perimeter of triangle: " + per);
    }
}
public class abstraction {
    public static void main(String[] args) {
        TriangleShape t = new TriangleShape();
        square s = new square();

        System.out.println("Enter triangle details");
        t.getdetails();
        t.area();
        t.perimeter();

        System.out.println("Enter square details");
        s.getdetails();
        s.area();
        s.perimeter();
    }
}
