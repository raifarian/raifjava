import java.util.Scanner;

interface Dept {
    void showDept();
}

class Student implements Dept {
    String name;
    String deptName;

    Student(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
    }

    public void showDept() {
        System.out.println(name + " - " + deptName);
    }
}

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[10];
        int count = 0;

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter name:");
                String name = sc.next();
                System.out.println("Enter dept:");
                String dept = sc.next();
                arr[count++] = new Student(name, dept);
            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    arr[i].showDept();
                }
            } else {
                break;
            }
        }
    }
}