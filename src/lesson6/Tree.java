package lesson6;

enum Status {
    ALIVE, DEAD
}public class Tree {
    private String name;
    private int age;
    private Status status;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Tree(String name, int age, Status status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }


    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }


    @Override
    public String toString() {
        return "Tree: " + this.name +
                " , age=" + age +
                ", status=" + status;
    }
}


