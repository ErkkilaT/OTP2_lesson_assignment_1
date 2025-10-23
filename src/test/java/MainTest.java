import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.*;
import java.util.Scanner;

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



    @Test
    void testCalculateTotal() {
        // Simulate user input: 2 items -> (10×1) and (5×2)
        String input = "2\n10\n1\n5\n2\n";
        Scanner sc = new Scanner(new ByteArrayInputStream(input.getBytes()));

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("en", "US"));

        int result = Main.calculateTotal(sc, rb);

        assertEquals(20, result);
    }

}