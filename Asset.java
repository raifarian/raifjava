class Asset {
    String name;
    double value;
    String category;

    Asset(String name, double value, String category) {
        this.name = name;
        this.value = value;
        this.category = category;
    }

    void display() {
        System.out.println(name);
        System.out.println(value);
        System.out.println(category);
    }
}

public class Main {
    public static void main(String[] args) {
        Asset a = new Asset("Gold", 500000, "Investment");
        a.display();
    }
}