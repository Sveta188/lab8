package builder;

public class Prepod {
    Exambuilder builder;

    public void setBuilder(Exambuilder builder) {
        this.builder = builder;
    }

    Exam buildexam(){
        builder.sdatExam();
        builder.buildName();
        builder.buildKak();
        builder.buildMark();

        Exam exam = builder.getExam();

        return exam;
    }
}
