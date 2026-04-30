abstract class ThreeDObject {
    abstract double volume();
    abstract double surfaceArea();
}

class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double volume() {
        return side * side * side;
    }

    double surfaceArea() {
        return 6 * side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        ThreeDObject obj = new Cube(5);
        System.out.println(obj.volume());
        System.out.println(obj.surfaceArea());
    }
}