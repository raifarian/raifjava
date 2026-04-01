import java.util.Scanner;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    double radius;
    Point p;

    Circle(int x, int y, double r) {
        p = new Point(x, y);
        radius = r;
    }

    void display() {
        double area = 3.14 * radius * radius;
        System.out.println("\nCenter Point: (" + p.x + ", " + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class MainCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(x, y, r);
        c.display();
    }
}