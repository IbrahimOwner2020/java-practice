package Resources.Class;

public class Class {
    int x = 19;
    final int y = 25;

    public static void main(String[] args) {
        Class myObj = new Class();
        Class myObj2 = new Class();
        myObj.x = 20;
        // myObj.y = 12;
        System.out.println("object 1 = " + myObj.x);
        System.out.println("object 1 y= " + myObj.y);
        System.out.println("object 2 = " + myObj2.x);
    }
}