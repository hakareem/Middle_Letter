package middle_letter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testShouldGetBackMiddle() {
        App test = new App();
        assertEquals("es", test.getMidOfString("test"));
    }

    @Test public void testOneLetterString() {
        App test = new App();
        assertEquals("A", test.getMidOfString("A"));
    }

    @Test public void testLongerString() {
        App test = new App();
        assertEquals("t", test.getMidOfString("testing"));
    }

    @Test public void testTwoLetterString() {
        App test = new App();
        assertEquals("of", test.getMidOfString("of"));
    }

    @Test public void testMid() {
        App test = new App();
        assertEquals("dd", test.getMidOfString("middle"));
    }
}
