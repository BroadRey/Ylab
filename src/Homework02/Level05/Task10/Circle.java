package Homework02.Level05.Task10;

public class Circle {
    private double centerX;
    private double centerY;
    private double radius;
    private double width;
    private String color;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        color = "Gray";
        width = 15;
    }

    public Circle(double centerX, double centerY, double radius, double width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        color = "Gray";
    }

    public Circle(double centerX, double centerY, double radius, double width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
