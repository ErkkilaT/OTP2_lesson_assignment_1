import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.*;

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


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }
    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void mainCalcTest(){
        String testInput = "1\n2\n10\n1\n5\n2\n";
        System.setIn(new ByteArrayInputStream(testInput.getBytes()));
        Main.main(new String[0]);
        String testOutput = outContent.toString();
        assertTrue(testOutput.contains("20"));
    }

}