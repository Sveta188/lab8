package fasad;

public class Process {
    private boolean activeProcess;

    public boolean isActiveProcess() {
        return activeProcess;
    }

    public void startProcess(){
        System.out.println("Process is active.");
        activeProcess = true;
    }

    public void finishProcess(){
        System.out.println("Process is not active.");
        activeProcess = false;
    }
}
