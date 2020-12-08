package builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExamTest {
    @Test
    public void testMark() {
        Exam exam=new Exam();
        int actual = exam.setMark(9);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    public void testName(){
        Exam exam=new Exam();
        String actual = exam.setName("OOP");
        String expected = "OOP";
        assertEquals(expected,actual);
    }
}