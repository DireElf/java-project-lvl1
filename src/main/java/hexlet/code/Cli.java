package hexlet.code;


import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
