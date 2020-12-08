package Composite;

public class CppDeveloper extends Developer{
    public CppDeveloper(String name, int age) {
        super(name, age);
    }
    public CppDeveloper(){}

    @Override
    public String writeCode() {
        System.out.println("C++ developer writes C++ code...");
        return ("C++ developer writes C++ code...");
    }
}
