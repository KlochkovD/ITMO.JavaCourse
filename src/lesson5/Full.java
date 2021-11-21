package lesson5;

public class Full {
    public static void main(String[] args) {

        Vector vector = new Vector(6,3,5);
        System.out.println("Вектор " + vector);

        System.out.println("Длина вектора " +vector +" = "
                + vector.lengthVector(3));

        Vector vector2 = new Vector(4,9,1 );
        System.out.println("Скалярное произведение векторов "+ vector
                +" и "+ vector2+" = "
                + vector.scalarProduct(vector2,3));

        System.out.println("Векторное произведение векторов "+ vector
                +" и "+ vector2+" = "
                + vector.vectorProduct(vector2));


        System.out.println("Угол между векторами "+ vector
                +" и "+ vector2+": "
                + vector.cornerVectors(vector2, 3));

        System.out.println("Сложение векторов "+ vector
                +" и "+ vector2+" = "
                + vector.vectorAddition(vector2));
        System.out.println("Вычитание векторов "+ vector
                +" и "+ vector2+" = "
                + vector.vectorSubtract(vector2));


        Vector[] vectors = generateArrayVectors(6,0,10);
        System.out.println("\nМассив векторов: ");
        for (Vector value : vectors) {
            System.out.println("Вектор: " + value);
        }
    }

    public static Vector[] generateArrayVectors(int valueSize, int Begin, int End){

        Vector[] vectors = new Vector[valueSize];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(
                    ((int) (Math.random() * End) + Begin),
                    ((int) (Math.random() * End) + Begin),
                    ((int) (Math.random() * End) + Begin)
            );
        }
        return vectors;
    }
}