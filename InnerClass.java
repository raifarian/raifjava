class OuterClass {
    int x = 10;

    class InnerClass {
        void display() {
            System.out.println("Value of x from Outer class: " + x);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}