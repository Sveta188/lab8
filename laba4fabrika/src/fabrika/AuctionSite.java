package fabrika;

import fabrika.website.Websiteteam;

public class AuctionSite {
    public static void main (String[] args){
        ProjectTeam projectTeam=new Websiteteam();
        Developer developer=projectTeam.getDeveloper();
        Tester tester = projectTeam.getTester();
        ProjectManager projectManager=projectTeam.getProjectManager();

        System.out.println("Creating auction website");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
