package just.artmmslv;

import just.artmmslv.xmlconverter.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XMLConverterTest {
    @Test
    public void simpleTest(){
        assertEquals(2 + 2, 4);
    }


    @Test
    public void greetingTest(){
        String s = Main.greeting();
        assertNotNull(s);
        assertTrue(s.startsWith("Hello"));
    }
}
