package fabrika.website;

import fabrika.Developer;
import fabrika.ProjectManager;
import fabrika.ProjectTeam;
import fabrika.Tester;

public class Websiteteam implements ProjectTeam {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
