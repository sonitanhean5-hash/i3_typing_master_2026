package src;

import java.util.Scanner;

public class WelcomeScreen {
    public static void show() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== I3 Typing Master v2026 ===");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Reset Password");
            System.out.println("4. Typing Test");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> LoginScreen.show();
                case 2 -> RegisterScreen.show();
                case 3 -> ResetPasswordScreen.show();
                case 4 -> TypingTestScreen.show();
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}
