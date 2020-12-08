package builder;

public class Kaksdatex {
    public static void main(String[] args){
        Prepod prepod = new Prepod();
        prepod.setBuilder(new avtomat());
        Exam exam =prepod.buildexam();
        System.out.println(exam);
    }
}
