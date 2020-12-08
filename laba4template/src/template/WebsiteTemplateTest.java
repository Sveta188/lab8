package template;

import org.junit.Test;

import static org.junit.Assert.*;

public class WebsiteTemplateTest {

    @Test
    public void testContentWelcomePage() {
            Welcomepage welcomepage=new Welcomepage();
            String actual = welcomepage.showPageContent();
            String expected ="Welcome";
            assertEquals(expected,actual);
    }

    @Test
    public void testContentNewsPage(){
        Newspage newspage=new Newspage();
        String actual=newspage.showPageContent();
        String expected="News";
        assertEquals(expected,actual);
    }
}