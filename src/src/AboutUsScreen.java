package src;

import java.util.Scanner;

public class AboutUsScreen {
    public static void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------------ About Us -----------");
        System.out.println("Project: I3 Typing Master 2026");
        System.out.println();
        System.out.println("This application is designed to help users");
        System.out.println("improve their typing speed and accuracy.");
        System.out.println();
        System.out.println("Features include:");
        System.out.println("- User Registration");
        System.out.println("- User Login");
        System.out.println("- Reset Password");
        System.out.println("- Typing Speed Test");
        System.out.println("- Test Result Display");
        System.out.println();
        System.out.println("Developed by:");
        System.out.println("- [Your Name]");
        System.out.println("- [Classmate 1]");
        System.out.println("- [Classmate 2]");
        System.out.println();
        System.out.println("Course: Introduction to Programming Environment");
        System.out.println("Year: 2026");
        System.out.println("---------------------------------");

        System.out.print("Press ENTER to return...");
        sc.nextLine();
    }
}
