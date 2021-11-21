package lesson4;

import java.util.ArrayList;

    public class z1 {

        public static void main(String[] args) {
            ArrayList<String> Str = new ArrayList<String>();
            Str.add("Ivan Petrov");
            Str.add("Ivan Smirnov");
            Str.add("Ivan Ivanov");

            int largestString = Str.get(0).length();
            int index = 0;

            for(int i = 0; i < Str.size(); i++) {
                if(Str.get(i).length() > largestString) {
                    largestString = Str.get(i).length();
                    index = i;
                }
            }

            System.out.println(Str.get(index));
        }
    }


