package Homework02.Level05.Task04;

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialize(String name) {
        this.name = name;
        weight = 5;
        color = "Gray";
        age = 4;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Gray";
    }

    public void initialize(String name, int age) {
        this.name = name;
        weight = 2;
        this.age = age;
        color = "Gray";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 4;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 4;
    }
}
