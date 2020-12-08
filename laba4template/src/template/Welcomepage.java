package template;

public class Welcomepage extends WebsiteTemplate{
    @Override
    public String showPageContent() {
        System.out.println("Welcome");
        return ("Welcome");
    }
}
