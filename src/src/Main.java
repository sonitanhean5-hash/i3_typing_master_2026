package src;
import java.util.HashMap;

public class Main {
    public static HashMap<String, String> users = new HashMap<>();
    public static void main(String[] args) {
        users.put("admin", "admin123");
        WelcomeScreen.show();
    }
}