import java.util.Locale;
import java.util.Scanner;
import java.util.ResourceBundle;

public class LecTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Language:");
        String language = sc.nextLine();
        System.out.println("Enter Country");
        String country = sc.nextLine();

        System.out.println("Welcome to localization " + language + " " + country);

        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
        String message = rb.getString("wish");
        System.out.println(message);
    }
}
