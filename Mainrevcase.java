import java.util.Scanner;

public class Mainrevcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Reverse words
        String words[] = str.split(" ");
        System.out.print("Reversed: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        // Move to next line
        System.out.println();

        // Change case
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += ch;
        }

        System.out.println("Changed case: " + result);
    }
}