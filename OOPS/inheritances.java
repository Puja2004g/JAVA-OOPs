package OOPS;

//Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager,
// Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods
// for calculating bonuses, generating performance reports, and managing projects.

import java.util.Scanner;

class employee{
    String name;
    String address;
    double salary;
    String jobTitle;

    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = sc.nextLine();
        System.out.println("Enter the address of " + name +" : ");
        address = sc.nextLine();
        System.out.println("Enter job title of " + name +" : ");
        jobTitle = sc.nextLine();
        System.out.println("Enter salary of " + name +" : ");
        salary = sc.nextDouble();
    }

    void printDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Address : " + this.address);
        System.out.println("Salary : " + this.salary);
        System.out.println("Job Title : " + this.jobTitle);
    }
}

class manager extends employee {

    double calculateBonus(){
        return this.salary * 0.15;
    }

    void performanceReports(){
        System.out.println("Performance report of "+ this.name + " is : excellent");
    }

    void managingProjects(){
        String project;
        Scanner sc = new Scanner(System.in);
        project = sc.nextLine();

        System.out.println(this.name + " is handling "+ project);
    }

}

class developer extends employee{
    double calculateBonus(){
        return this.salary * 0.10;
    }

    void performanceReports(){
        System.out.println("Performance report of "+ this.name + " is : excellent");
    }

    void managingProjects(){
        String project;
        Scanner sc = new Scanner(System.in);
        project = sc.nextLine();

        System.out.println(this.name + " is handling "+ project);
    }
}

class programmer extends employee{
    double calculateBonus(){
        return this.salary * 0.10;
    }

    void performanceReports(){
        System.out.println("Performance report of "+ this.name + " is : excellent");
    }

    void managingProjects(){
        String project;
        Scanner sc = new Scanner(System.in);
        project = sc.nextLine();

        System.out.println(this.name + " is handling "+ project);
    }
}

public class inheritances {
    public static void main(String[] args) {
        manager objm = new manager();
        developer objd = new developer();
        programmer objp = new programmer();

        System.out.println("Manager details");
        objm.getDetails();
        objm.printDetails();
        double bonus2 = objm.calculateBonus();
        System.out.println("Bonus " + bonus2);
        objm.managingProjects();
        objm.performanceReports();

        System.out.println("Programmer details");
        objp.getDetails();
        objp.printDetails();
        double bonus1 = objp.calculateBonus();
        System.out.println("Bonus " + bonus1);
        objp.managingProjects();
        objp.performanceReports();

        System.out.println("Developer details");
        objd.getDetails();
        double bonus3 = objd.calculateBonus();
        System.out.println("Bonus " + bonus3);
        objd.managingProjects();
        objd.performanceReports();
        objd.printDetails();


        new Scanner(System.in).close();
    }
}
