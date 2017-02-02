import java.util.Locale;
import java.util.ResourceBundle;

import static java.util.ResourceBundle.getBundle;

public class Main {

    // Used with IntelliJ for "Extracting Hard-Coded String Literals"
    private static ResourceBundle myBundle = getBundle("MessagesBundle");

    public static void main(String[] args) {

        // Locale is set by host machine
        System.out.println("\n" + myBundle.getString("alert.content") + "\n");

        // Locale is set "manually"
        //String language = null;
        //String country = null;

        String language = "de";
        String country = "DE";

        if (language == null || country == null) {
            language = new String("en");
            country = new String("US");
        }

        Locale currentLocale;
        ResourceBundle messages;

        currentLocale = new Locale(language, country);

        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        System.out.println(messages.getString("greetings"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farewell"));

    }
}
