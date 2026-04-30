class MethodOverloading {

    void show() {
        System.out.println("No parameters");
    }

    void show(int a) {
        System.out.println(a);
    }

    void show(int a, int b) {
        System.out.println(a + b);
    }

    void show(String name) {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.show();
        m.show(10);
        m.show(10, 20);
        m.show("Java");
    }
}