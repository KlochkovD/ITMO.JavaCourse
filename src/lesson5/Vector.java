package lesson5;

public class Vector {
    public int x;
    public int y;
    public int z;
    public Vector(int x, int y, int z){

        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + ", " + z + "}";
    }

    public double lengthVector(int countDecimal) {

        double value = Math.sqrt(x * x + y * y + z * z);
        double scale = Math.pow(10, countDecimal);
        value = Math.ceil(value * scale) / scale;
        return value;
    }

    public double scalarProduct(Vector vector, int countDecimal){


        double value = Math.sqrt(x * vector.x + y * vector.y + z * vector.z);
        double scale = Math.pow(10, countDecimal);
        value = Math.ceil(value * scale) / scale;
        return value;
    }
    public Vector vectorProduct(Vector vector){

        int newX = y * vector.z - z * vector.y;
        int newY = z * vector.x - x * vector.z;
        int newZ = x * vector.y - y * vector.x;
        return new Vector(newX,newY, newZ);
    }
    public double cornerVectors(Vector vector, int countDecimal){

        double value = scalarProduct(vector, 3) /
                (this.lengthVector(3)
                        * vector.lengthVector(3));

        double scale = Math.pow(10, countDecimal);
        value = Math.ceil(value * scale) / scale;
        return value;
    }

    public Vector vectorSubtract(Vector vector){

        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }
    public Vector vectorAddition(Vector vector){

        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }
}