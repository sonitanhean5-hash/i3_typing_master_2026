package src;
import java.util.Scanner;

public class LoginScreen {

    public static void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------- Authentication --------------");

        System.out.print("Username (left blank to cancel): ");
        String username = sc.nextLine();

        if (username.isEmpty()) {
            System.out.println("Login cancelled.");
            return;
        }

        System.out.print("Password: ");
        String password = sc.nextLine();

        if (Main.users.containsKey(username) &&
                Main.users.get(username).equals(password)) {

            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password!");
        }
    }
}