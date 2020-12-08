package builder;

public class avtomat extends Exambuilder {
    @Override
    void buildName() {
        exam.setName("PISM");

    }

    @Override
    void buildKak() {
        exam.setKak(Kak.avtomat);
    }

    @Override
    void buildMark() {
        exam.setMark(9);
    }
}
