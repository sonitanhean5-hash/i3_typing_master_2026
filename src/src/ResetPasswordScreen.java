package src;

import java.util.Scanner;

public class ResetPasswordScreen {
    public static void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------ Reset Password -----------");

        System.out.print("Username (left blank to cancel): ");
        String username = sc.nextLine();

        if (username.isEmpty()) {
            System.out.println("Reset cancelled.");
            return;
        }

        if (!Main.users.containsKey(username)) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("New password: ");
        String newPass = sc.nextLine();

        System.out.print("Confirm password: ");
        String confirm = sc.nextLine();

        if (!newPass.equals(confirm)) {
            System.out.println("Passwords do not match!");
            return;
        }

        Main.users.put(username, newPass);
        System.out.println("Password reset successful!");
    }
}
