import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task16Test {

    Task16 task16;
    Number expected;
    Number actual;

    @Before
    public void setUp() throws Exception {
        task16 = new Task16();
    }
    @Test
    public void test_input_text1(){
        expected = 8.0;
        actual = 11;
        String e = "expected " + expected + ", " + "got " + actual;
        assertEquals(e, task16.testInputText(expected, actual));
    }

    @Test
    public void test_input_text2(){
        expected = 8;
        actual = 11.0;
        String e = "expected " + expected + ", " + "got " + actual;
        assertEquals(e, task16.testInputText(expected, actual));
    }
    @Test
    public void test_input_text3(){
        expected = 11;
        actual = 11.0;
        String e = "";
        assertEquals(e, task16.testInputText(expected, actual));
    }
    @Test
    public void test_input_text4(){
        expected = 11;
        actual = 11;
        String e = "";
        assertEquals(e, task16.testInputText(expected, actual));
    }
    @Test
    public void test_input_text5(){
        expected = 11;
        actual = 15;
        String e = "expected " + expected + ", " + "got " + actual;
        assertEquals(e, task16.testInputText(expected, actual));
    }
}