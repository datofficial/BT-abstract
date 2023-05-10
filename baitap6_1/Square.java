package day3.baitap6_1;

public class Square extends Rectangle{
    protected double side = 1.0;
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square[shape[" +
                ", color='" + color + '\'' +
                ", filled=" + filled + "]" +
                ", length=" + side +
                ", width=" + side + ']' +
                ", Area=" + getArea() +
                ", Perimeter" + getPerimeter() +
                ']';
    }
}
