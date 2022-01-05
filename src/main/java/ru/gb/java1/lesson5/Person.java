package ru.gb.java1.lesson5;

public class Person {

    public String name;
    public String post;
    public String email;
    public String tel;
    public int salary;
    public int age;

    public Person(String name, String post, String email, String tel, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public Person() {

    }

    public void print() {
        System.out.print("Имя:" + this.name);
        System.out.print(" Должность:" + this.post);
        System.out.print(" Электронная почта:" + this.email);
        System.out.print(" Телефон:" + this.tel);
        System.out.print(" Зарплата:" + this.salary);
        System.out.print(" Возраст:" + this.age);
        System.out.println();
    }


}
