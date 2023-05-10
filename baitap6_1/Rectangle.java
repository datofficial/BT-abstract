package day3.baitap6_1;

public class Rectangle extends Shape{
    protected double length =1.0;
    protected double width = 1.0;

    public Rectangle(double side, double side1) {
    }

    public Rectangle() {

    }

    public void Rectanggle(){}

    public void Rectanggle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length + width)*2;
    }

    @Override
    public String toString() {
        return "Rectanggle[shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled + "]" +
                ", length=" + length +
                ", width=" + width + "]" +
                ", Area=" + getArea() +
                ", Perimeter" + getPerimeter() +
                ']';
    }
}
