import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    Tender(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }
}

public class MainTender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] tenders = new Tender[5];

        for (int i = 0; i < tenders.length; i++) {
            System.out.println("Enter company name for tender " + (i + 1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter cost for tender " + (i + 1) + ":");
            double cost = sc.nextDouble();
            sc.nextLine();
            tenders[i] = new Tender(cost, name);
        }

        double minCost = tenders[0].cost;
        String minCompany = tenders[0].companyName;

        for (int i = 1; i < tenders.length; i++) {
            if (tenders[i].cost < minCost) {
                minCost = tenders[i].cost;
                minCompany = tenders[i].companyName;
            }
        }

        System.out.println("\nCompany with minimum cost: " + minCompany);
        System.out.println("Minimum Cost: " + minCost);

        sc.close();
    }
}