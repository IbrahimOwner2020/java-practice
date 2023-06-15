package Resources.Class;

// constructors are special objects used to initialize objects
public class Constructor {
    int age;
    String fullNames;

    public Constructor(int y, String names) {
        age = y;
        fullNames = names;
    }

    public static void main(String[] args) {
        Constructor contr = new Constructor(20, "Ibrahim John");

        System.out.println(contr.age);
        System.out.println(contr.fullNames);
    }
}
