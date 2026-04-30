public class MotorVehicle {
}
class MotorVehicle {
    String brand;
    String model;
    int year;
    double price;

    MotorVehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        System.out.println(price);
    }
}

public class Main {
    public static void main(String[] args) {
        MotorVehicle mv = new MotorVehicle("Toyota", "Innova", 2022, 2500000);
        mv.display();
    }
}