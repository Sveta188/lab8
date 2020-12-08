package template;

public class Newspage extends WebsiteTemplate{
    @Override
    public String showPageContent() {
        System.out.println("News");
        return("News");
    }
}
