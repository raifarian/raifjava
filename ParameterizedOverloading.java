public class ParameterizedOverloading {
    public static void main(String[] args) {
        display(10);
        display(10, 20);
        display("Hello", 5);
    }

    static void display(int a) {
        System.out.println(a);
    }

    static void display(int a, int b) {
        System.out.println(a + " " + b);
    }

    static void display(String s, int n) {
        System.out.println(s + " " + n);
    }
}