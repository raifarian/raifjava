interface Mango {
    void taste();
}

class Alphonso implements Mango {
    public void taste() {
        System.out.println("Sweet");
    }
}

public class Main {
    public static void main(String[] args) {
        Mango m = new Alphonso();
        m.taste();
    }
}