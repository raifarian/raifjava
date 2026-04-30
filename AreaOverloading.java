class AreaOverloading {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        AreaOverloading a = new AreaOverloading();

        System.out.println(a.area(5));
        System.out.println(a.area(10));
        System.out.println(a.area(4, 6));
    }
}