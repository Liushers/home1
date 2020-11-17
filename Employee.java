package ru.geekbrains.java_one1;

public class Employee {

    String name;
    String position;
    String mobile;
    int salary;
    int age;

    //private Employee() {
    //    salary = 15000;}

    Employee(String name, String position, String mobile, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mobile = mobile;
        this.salary = salary;
        this.age = age;
        System.out.println("Employee file" + "\n");
    }

    public String name() {
        return this.name;
    }

    public String position() {
        return this.position;
    }

    public String mobile() {
        return this.mobile;
    }

    public int salary() {
        return this.salary;
    }

    public int age() {
        return this.age;
    }
}
