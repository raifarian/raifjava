import java.util.Scanner;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    double radius;
    Point center;

    Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Circle Center: (" + center.x + ", " + center.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}

public class MainCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x-coordinate of circle center:");
        double x = sc.nextDouble();
        System.out.println("Enter y-coordinate of circle center:");
        double y = sc.nextDouble();

        System.out.println("Enter radius of the circle:");
        double r = sc.nextDouble();

        Point center = new Point(x, y);
        Circle circle = new Circle(r, center);

        circle.display();

        sc.close();
    }
}