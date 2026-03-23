package src;

import java.util.Scanner;

public class RegisterScreen {
    public static void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------ New User Registration -----------");

        System.out.print("Input a unique username (left blank to cancel): ");
        String username = sc.nextLine();

        if (username.isEmpty()) {
            System.out.println("Registration cancelled.");
            return;
        }

        if (Main.users.containsKey(username)) {
            System.out.println("Username already exists!");
            return;
        }

        System.out.print("Input password: ");
        String password = sc.nextLine();

        System.out.print("Input confirm password: ");
        String confirm = sc.nextLine();

        if (!password.equals(confirm)) {
            System.out.println("Passwords do not match!");
            return;
        }

        Main.users.put(username, password);
        System.out.println("Registration successful!");
    }
}
