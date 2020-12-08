package fasad;

public class Developer {
    public void doJobBeforeData(Process process){
        if(process.isActiveProcess()){
            System.out.println("Developer is solving problems...");
        }
        else
        {
            System.out.println("Developer is reading News...");
        }
    }
}
