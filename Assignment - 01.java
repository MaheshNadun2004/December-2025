class Shape {
    double getArea() {
        return 0;
    }
    double getPerimeter() {
        return 0;
    }
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    @Override
    double getArea() {
        return l * w;
    }
    @Override
    double getPerimeter() {
        return 2 * (l + w);
    }
}

class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    @Override
    double getArea() {
        return Math.PI * r * r;
    }
    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }
}

class Triangle extends Shape {
    double a, b, c, h;

    Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    @Override
    double getArea() {
        return 0.5 * b * h;
    }
    @Override
    double getPerimeter() {
        return a + b + c;
    }
}

public class Assignment1{
    public static void main(String[] args) {

        Shape rect = new Rectangle(10, 5);
        Shape cir = new Circle(7);
        Shape tri = new Triangle(3, 4, 5, 4);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter());

        System.out.println("Circle Area: " + cir.getArea());
        System.out.println("Circle Perimeter: " + cir.getPerimeter());

        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter());
    }
}
