package Homework02.Level05.Task07;

public class Rectangle {
    private double top;
    private double left;
    private double width;
    private double height;

    public void initialize(double top) {
        this.top = top;
        this.left = 24;
        this.width = 33;
        this.height = 34;
    }

    public void initialize(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public void initialize(double top, double left) {
        this.top = top;
        this.left = left;
        this.width = 33;
        this.height = 34;
    }

    public void initialize(double top, double left, double width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 34;
    }

    public void initialize(double top, double left, double width, double height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
}
