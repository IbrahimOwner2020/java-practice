package Resources.Class;

public class Car {
    public void fullThrottle() {
        System.out.println("The car is going very fast");
    }

    public void speed(int maxSpeed) {
        System.out.println("with a max speed of " + maxSpeed);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.speed(360);
    }
}
