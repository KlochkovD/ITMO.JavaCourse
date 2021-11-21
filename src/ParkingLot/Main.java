package ParkingLot;


public class Main {
    public static void main(String[] args) {


        parkingLots();
    }


    public static void parkingLots(){
        Parking parking = new Parking(8);
        parking.addCar(new Car("Tesla", 90));
        parking.addCar(new Car("Audi", 180));
        parking.addCar(new Car("BMW", 45));
        ;

        parking.printParkingCar();

    }

}
