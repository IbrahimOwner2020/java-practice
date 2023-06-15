package Resources.Class;

public class ClassMethod {
    static void helloMe() {
        System.out.println("Hello kidibra");
    }

    // static method
    static void staticMethod() {
        System.out.println("This is the static method");
    }

    // public method
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    public static void main(String[] args) {
        helloMe();

        // calling static method
        staticMethod();

        // calling a public method
        ClassMethod obj = new ClassMethod();
        obj.publicMethod();
    }
}
