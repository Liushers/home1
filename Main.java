package ru.geekbrains.java_one1;

public class Main {
    public static void main(String[] args) {

        Employee a1 = new Employee("Alexiy Ivanovich Marenko", "Manager", "+380993829937",
                15000, 32);
        //a1.name = "Alexiy Ivanovich Marenko";
        //a1.position = "Manager";
        //a1.mobile = "+380993829937";
        //a1.salary = 15000;
        //a1.age = 32;
        System.out.println("Employee: " + a1.name + "\n" + "Position: " + a1.position + "\n" + "Phone number: "
                + a1.mobile + "\n" + "Salary: " + a1.salary + "\n" + "Is of age: " + a1.age);
        System.out.println("Employee: " + a1.name() + "\n" + a1.position());
    }
}
