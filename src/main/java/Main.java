import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select language:");
        System.out.println("1 - English");
        System.out.println("2 - Finnish");
        System.out.println("3 - Swedish");
        System.out.println("4 - Japanese");
        String opt = sc.nextLine();
        String language = "en";
        String country = "US";
        switch (opt) {
            case "1":
                break;
            case "2":
                language = "fi";
                country = "FI";
                break;
            case "3":
                language = "sv";
                country = "SE";
                break;
            case "4":
                language = "ja";
                country = "JP";
                break;

        }

        System.out.println("Welcome to localization " + language + " " + country);

        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
        System.out.println(rb.getString("amountOfItems"));
        int amount = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= amount; i++) {
            System.out.println(i + ". " + rb.getString("price"));
            int price = sc.nextInt();
            System.out.println(i + ". " + rb.getString("quantity"));
            int quantity = sc.nextInt();
            total += (price*quantity);
        }
        System.out.println(rb.getString("total") + " " + total);
    }
}
