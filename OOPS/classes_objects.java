package OOPS;
//Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each
// operation whose real and imaginary parts are entered by user.

import java.util.Scanner;

class Complex{
    float real, img;
    void getComplex(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real: ");
        this.real = sc.nextFloat();
        System.out.print("Enter imaginary: ");
        this.img = sc.nextFloat();
    }
    void addComplex(Complex c1, Complex c2){
        this.real = c1.real+c2.real;
        this.img = c1.img + c2.img;
    }
    void subComplex(Complex c1, Complex c2){
        this.real = c1.real+c2.real;
        this.img = c1.img + c2.img;
    }
    void productComplex(Complex c1, Complex c2){
        this.real = (c1.real*c2.real)-(c1.img*c2.img);
        this.img = (c1.real*c2.img) + (c1.img*c2.real);
    }
    void printComplex(){
        System.out.println(this.real + " + i" + this.img);
    }
}

public class classes_objects {
    public static void main(String[] args) {
        System.out.println("Enter two complex numbers: ");
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        c1.getComplex();
        c2.getComplex();
        c1.printComplex();
        c2.printComplex();

        System.out.println("Addition: ");
        c3.addComplex(c1,c2);
        c3.printComplex();

        System.out.println("Subtraction: ");
        c3.subComplex(c1,c2);
        c3.printComplex();

        System.out.println("Product: ");
        c2.productComplex(c1,c2);
        c3.printComplex();

    }
}
