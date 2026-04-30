import java.util.Scanner;

class Item {
    String name;
    double price;
    int qty;

    Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    double total() {
        return price * qty;
    }

    void display() {
        System.out.println(name + " " + price + " " + qty + " " + total());
    }
}

public class CommercialSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[10];
        int n = 0;

        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Show Bill");
            System.out.println("3. Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Enter name:");
                String name = sc.next();
                System.out.println("Enter price:");
                double price = sc.nextDouble();
                System.out.println("Enter qty:");
                int qty = sc.nextInt();
                items[n++] = new Item(name, price, qty);
            } else if (ch == 2) {
                double grand = 0;
                for (int i = 0; i < n; i++) {
                    items[i].display();
                    grand += items[i].total();
                }
                System.out.println("Grand Total: " + grand);
            } else {
                break;
            }
        }
    }
}