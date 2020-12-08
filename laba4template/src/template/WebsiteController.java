package template;

public class WebsiteController {
    public static void main(String[] args) {
        WebsiteTemplate welcomepage = new Welcomepage();
        WebsiteTemplate newspage= new Newspage();

        welcomepage.showPage();

        System.out.println("\n==========\n");

        newspage.showPage();
    }
}
