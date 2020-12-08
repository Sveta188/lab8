package fabrika;

import fabrika.banking.BankingTeam;

public class SuperBankSystem {
    public static void main (String[] args){
        ProjectTeam projectTeam = new BankingTeam();
        Developer developer = projectTeam.getDeveloper();
        Tester tester=projectTeam.getTester();
        ProjectManager projectManager=projectTeam.getProjectManager();

        System.out.println("Creating Bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
