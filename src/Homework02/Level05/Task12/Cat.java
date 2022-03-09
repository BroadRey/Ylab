package Homework02.Level05.Task12;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Кошку зовут " + name
                + "\nЕе возраст: " + age
                + "\nЕе цвет: " + color;
    }
}
