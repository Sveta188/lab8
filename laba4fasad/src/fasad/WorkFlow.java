package fasad;

public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    Process process=new Process();

    public void  solveProblems(){
        job.doJob();
        process.startProcess();
        developer.doJobBeforeData(process);
    }
}
