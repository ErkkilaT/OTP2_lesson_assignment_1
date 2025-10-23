import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testEn() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("en","US"));
        assertEquals("Enter the number of items to purchase:", rb.getString("amountOfItems"));
    }
    @Test
    void testFi(){
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("fi","FI"));
        assertEquals("Syötä ostettavien tuotteiden määrä:", rb.getString("amountOfItems"));
    }

}