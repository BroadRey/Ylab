package Homework02.Level05.Task09;

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat(String name) {
        this.name = name;
        weight = 5;
        color = "Gray";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Gray";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 5;
        color = "Gray";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
