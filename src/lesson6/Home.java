package lesson6;

import java.util.Calendar;

public class Home {

    private int storeysNum;
    private int yearOfCompletion;
    private String name;


    public int getStoreysNum() {
        return storeysNum;
    }

    public void setStoreysNum(int storeysNum) {
        this.storeysNum = storeysNum;
    }

    public int getYearOfCompletion() {
        return yearOfCompletion;
    }

    public void setYearOfCompletion(int yearOfCompletion) {
        this.yearOfCompletion = yearOfCompletion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


  Home() {

    }


    public Home(String name, int yearOfCompletion, int storeysNum) {
        this.name = name;
        this.yearOfCompletion = yearOfCompletion;
        this.storeysNum = storeysNum;
    }

    public String printInfo() {
        return this.toString();
    }

    public int yearsSinceCompletion() {

        Calendar current = Calendar.getInstance();
        int currentYear = current.get(Calendar.YEAR);
        return currentYear - yearOfCompletion;
    }

    @Override
    public String toString() {
        return this.name +
                " number of storeys: " + storeysNum +
                ", year of completion: " + yearOfCompletion +
                ", name: '" + name + '\'';
    }
}

class TestBuilding {
    public static void main(String[] args) {
        // Using setters to set the fields
        Home building = new Home();
        building.setName("Empire State Building");
        building.setYearOfCompletion(1931);
        building.setStoreysNum(102);

        System.out.println(building.printInfo());
        System.out.println(building.getName() + " has been standing for "  + building.yearsSinceCompletion() + " years.");



    }
}