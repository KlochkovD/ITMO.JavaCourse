package lesson7;

public class z1 {
    public static void main(String[] args) {
        Truck truck = new Truck(2000, "model", 'r', 90, 12, 1000);
        truck.outPut();
    }
}

class Car {
    protected int weight;
    protected String model;
    protected char colour;
    protected float speed;

    public void outPut() {
        System.out.println("The weight of " + model + " is " + weight +
                " kg.");
        System.out.println("The colour of the vehicle is - " + colour + " and its speed - " +
                speed);
    }

    public Car(int w, String m, char c, float s) {
        weight = w;
        model = m;
        colour = c;
        speed = s;
    }

    public Car() {
    }

}

class Truck extends Car {
    public int wheelCount;
    public int maxWeight;

    public Truck(int weight, String model, char colour, float speed, int wheelCount, int maxWeight) {

        super(weight, model, colour, speed);
        this.wheelCount = wheelCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newCount) {

        this.wheelCount = newCount;
        System.out.println("This truck has " + this.wheelCount + " wheels.");
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("This truck has " + wheelCount + " wheels. And its maximum weight is " + maxWeight + " kg.");
    }
}
