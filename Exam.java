interface Exam {
    void showResult();
}

class Student implements Exam {
    public void showResult() {
        System.out.println("Passed");
    }
}

public class Main {
    public static void main(String[] args) {
        Exam e = new Student();
        e.showResult();
    }
}