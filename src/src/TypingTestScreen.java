package src;

import java.util.Scanner;

public class TypingTestScreen {
    public static void show() {
        Scanner sc = new Scanner(System.in);

        String text = "ffff jjjj dddd kkkk ssss llll aaaa ;;;; fdsa jkl; fdsa jkl; asdf jkl; asdf jkl; "
                + "sad dad had lad ask all fall hall flask shall gash hash flash glass glad "
                + "flag sag hash lash. Ask a glad lad all a salad.";

        System.out.println("------------ Typing Test Level 1 -----------");
        System.out.println("Type the following paragraph(s) to test your typing speed and quality (press ENTER to end the test and display the result):\n");

        System.out.println(text);
        System.out.println("------------------------------------------------------------");

        long start = System.currentTimeMillis();
        String input = sc.nextLine();
        long end = System.currentTimeMillis();

        double timeMinutes = (end - start) / 60000.0;

        int mistakes = 0;
        int length = Math.min(text.length(), input.length());

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != input.charAt(i)) {
                mistakes++;
            }
        }

        int totalChars = input.length();
        int cpm = (int)(totalChars / timeMinutes);
        int wpm = cpm / 5;

        // RESULT SCREEN
        System.out.println("\n--------------- Typing Test Level 1 Result --------------");
        System.out.println("Speed (characters/min): " + cpm);
        System.out.println("       (words/min): " + wpm);
        System.out.println("Total input characters: " + totalChars);
        System.out.println("       Total mistakes: " + mistakes);
        System.out.println("--------------------------------------------------------");

        System.out.println("1. Next level");
        System.out.println("2. Logout");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }
}
