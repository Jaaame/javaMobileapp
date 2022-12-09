import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Chapter01_01 {
    
    long id;
    String name;
    int age;
    double salary;

    public static void main(String[] args){
        Chapter01_01 person;
        Scanner scan = new Scanner(System.in);
        String strValue;

        person = new Chapter01_01();
        System.out.print("Enter Id: ");
        person.id = scan.nextLong();
        System.out.print("Enter Name: ");
        person.name = scan.next();
        System.out.print("Enter age: ");
        person.age = scan.nextInt();
        System.out.print("Enter Salary: ");
        person.salary = scan.nextDouble();

        System.out.println("Data person: ");
        System.out.println("======================================");
        System.out.println("ID : " + person.id);
        System.out.println("Name : " + person.name);
        System.out.println("Age : "+ person.age);
        System.out.println("Salary : "+ person.salary);
    }
}
