abstract class AbstractProduct {
    String name;
    double price;

    AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void display();
}

class ConcreteProduct extends AbstractProduct {

    ConcreteProduct(String name, double price) {
        super(name, price);
    }

    void display() {
        System.out.println(name);
        System.out.println(price);
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractProduct p = new ConcreteProduct("Laptop", 55000);
        p.display();
    }
}