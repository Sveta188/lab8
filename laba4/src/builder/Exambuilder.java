package builder;

public abstract class Exambuilder {
    Exam exam ;

    void sdatExam(){
        exam= new Exam();
    }

    abstract void buildName();
    abstract void buildKak();
    abstract void buildMark();

    Exam getExam(){
        return exam;
    }
}