import java.util.Scanner;

class Tender {
    double cost;
    String company;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        company = sc.next();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
    }
}

public class MainTender {
    public static void main(String[] args) {
        Tender t[] = new Tender[5];
        double minCost;
        String minCompany = "";

        // Input
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("Enter details for company " + (i + 1));
            t[i].input();
        }

        minCost = t[0].cost;
        minCompany = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].company;
            }
        }

        System.out.println("\nCompany with minimum cost: " + minCompany);
    }
}