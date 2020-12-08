package Composite;

public class JavaDeveloper extends Developer{

    public JavaDeveloper(String name, int age) {
        super(name, age);
    }
    public JavaDeveloper(){}

    @Override
    public String writeCode() {
        System.out.println("Java developer writes Java code...");
        return ("Java developer writes Java code...");
    }
}
