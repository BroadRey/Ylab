package Homework02.Level05.Task05;

public class Dog {
    private String name;
    private int height;
    private String color;

    public void initialize(String name) {
        this.name = name;
        height = 3;
        color = "Gray";
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
        color = "Gray";
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
