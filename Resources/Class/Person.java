package Resources.Class;

public class Person {
    final String firstName = "Ibrahim";
    final String lastName = "John";
    int age = 20;

    public static void main(String[] args) {
        Person mySelf = new Person();
        System.out.println("Names:" + mySelf.firstName + " " + mySelf.lastName);
        System.out.println("Age:" + mySelf.age);

        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.speed(240);
    }
}
