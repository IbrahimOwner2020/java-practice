package Resources.Inheritence;

class Vehicle {
    protected String brand = "Ford";

    public void horn() {
        System.out.println("Tuuuh tuuh");
    }
}

public class Car extends Vehicle {
    private String carModel = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.horn();

        System.out.println(myCar.brand + " " + myCar.carModel);
    }
}
