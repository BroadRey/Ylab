package Homework02.Level05.Task11;

public class Rectangle {
    private double top;
    private double left;
    private double width;
    private double height;

    public Rectangle(double top, double left, double width, double height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double top, double left) {
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public Rectangle(double top, double left, double width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
}
