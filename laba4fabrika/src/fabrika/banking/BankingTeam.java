package fabrika.banking;

import fabrika.Developer;
import fabrika.ProjectManager;
import fabrika.ProjectTeam;
import fabrika.Tester;

public class BankingTeam implements ProjectTeam {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
