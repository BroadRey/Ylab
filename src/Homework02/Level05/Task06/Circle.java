package Homework02.Level05.Task06;

public class Circle {
    private double centerX;
    private double centerY;
    private double radius;
    private double width;
    private String color;

    public void initialize(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        width = 5;
        color = "Green";
    }

    public void initialize(double centerX, double centerY, double radius, double width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        color = "Green";
    }

    public void initialize(double centerX, double centerY, double radius, double width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
