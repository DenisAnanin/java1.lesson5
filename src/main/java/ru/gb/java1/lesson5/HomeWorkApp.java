package ru.gb.java1.lesson5;

public class HomeWorkApp {
    public static Person[] persArray = new Person[5];

    public static void main(String[] args) {
        fillingArray();
        ages(40);
    }

    public static void fillingArray() {
        persArray[0] = new Person("Иванов Иван", "инженер", "ivanov@company.net", "8988000001", 10000, 20);
        persArray[1] = new Person("Петров Петр", "инженер", "petrov@company.net", "8988000002", 20000, 42);
        persArray[2] = new Person("Сидоров Сидор", "инженер", "sidorov@company.net", "8988000003", 30000, 43);
        persArray[3] = new Person("Александров Александр", "инженер", "aleksandrov@company.net", "8988000004", 40000, 18);
        persArray[4] = new Person("Михаилов Михаил", "инженер", "mihailov@company.net", "8988000005", 50000, 38);
    }

    public static void ages(int ages) {
        for (Person person : persArray) {
            if (person.age > ages) {
                person.print();
            }

        }
    }
}
