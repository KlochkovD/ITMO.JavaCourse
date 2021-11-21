package lesson6;

class Study {

    private String course;

    public String printCourse() {
        return this.course;
    }

    public Study(String course) {
        this.course = course;
    }

}

class JavaProgram {
    public static void main(String[] args) {
        Study studySomething = new Study("Изучение Java - это просто!");
        System.out.println(studySomething.printCourse());
    }
}