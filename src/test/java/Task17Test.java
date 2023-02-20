import org.junit.Test;

import static org.junit.Assert.*;

public class Task17Test {

    @Test
    public void task17TestSubstring1(){

        String fullString = "fulltext";
        String substring = "some_value";
        assertEquals(String.format("expected '%s' to be substring of '%s'", fullString, substring), new Task17().testSubstring(fullString, substring));

    }

    @Test
    public void task17TestSubstring2(){

        Integer fullString = 1;
        Integer substring = 1;
        assertEquals("", new Task17().testSubstring(fullString, substring));

    }

    @Test
    public void task17TestSubstring3(){

        String fullString = "some_text";
        String substring = "some";
        assertEquals("", new Task17().testSubstring(fullString, substring));

    }

}