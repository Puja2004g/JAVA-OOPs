package OOPS;

//Write a Java program to create a class called Person with private instance variables name, age. and country. Provide
// public getter and setter methods to access and modify these variables.

class person{
    private String name, country;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("Puja");
        p1.setAge(20);
        p1.setCountry("India");

        String name = p1.getName();
        String country = p1.getCountry();
        int age = p1.getAge();

        System.out.println("Name : " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: "+ country);
    }
}
