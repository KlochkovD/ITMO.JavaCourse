package lesson6;

class Plane {
    class Wing {
        private int weight;


        public Wing(int weight) {
            this.weight = weight;
        }


        public void print() {
            System.out.println("This wing weighs " + weight + " kg.");
        }
    }
}

class TestPlane {
    public static void main(String[] args) {

        Plane somePlane = new Plane();
        Plane.Wing wing = somePlane.new Wing(30000);
        wing.print();
    }
}