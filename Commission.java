public class Commission {
    public static void main(String[] args) {
        calculateCommission(5000);
        calculateCommission(10000, 0.1);
    }

    static void calculateCommission(double sales) {
        double commission = sales * 0.05;
        System.out.println(commission);
    }

    static void calculateCommission(double sales, double rate) {
        double commission = sales * rate;
        System.out.println(commission);
    }
}