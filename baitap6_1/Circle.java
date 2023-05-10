package day3.baitap6_1;

public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle(){}
//    public circle(double radius) {
//        this.radius = radius;
//    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Ban Kinh Phai Duong");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[shape[" +
                "color='" + color + '\'' +
                ",filled=" + filled + "]" +
                "radius=" + radius + ']' +
                ", Area=" + getArea() +
                ", Perimeter" + getPerimeter() +
                ']';
    }
}
