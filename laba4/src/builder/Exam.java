package builder;

public class Exam {
    private String name;
    private Kak kak;
    private int mark;

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void setKak(Kak kak) {
        this.kak = kak;
    }

    public int setMark(int mark) {
        this.mark = mark;
        return mark;
    }


    @Override
    public String toString() {
        return "Exam{" +
                "name='" + name + '\'' +
                ", kak=" + kak +
                ", mark=" + mark +
                '}';
    }
}
