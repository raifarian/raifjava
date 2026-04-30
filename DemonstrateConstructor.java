class DemonstrateConstructor {
    String name;
    int age;
    String city;

    DemonstrateConstructor() {
        name = "Unknown";
        age = 0;
        city = "Not Specified";
    }

    DemonstrateConstructor(String name) {
        this.name = name;
        age = 0;
        city = "Not Specified";
    }

    DemonstrateConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        city = "Not Specified";
    }

    DemonstrateConstructor(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }
}

public class Main {
    public static void main(String[] args) {
        DemonstrateConstructor d1 = new DemonstrateConstructor();
        DemonstrateConstructor d2 = new DemonstrateConstructor("Rahul");
        DemonstrateConstructor d3 = new DemonstrateConstructor("Amit", 22);
        DemonstrateConstructor d4 = new DemonstrateConstructor("Sneha", 21, "Kolkata");

        d1.display();
        d2.display();
        d3.display();
        d4.display();
    }
}