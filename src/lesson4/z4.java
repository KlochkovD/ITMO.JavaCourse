package lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class z4 {


         public static void main(String[] args) {
            String str = "abcabcabc";
            String substr = "abc";
            Pattern p = Pattern.compile(substr);
            Matcher m = p.matcher(str);
            int counter = 0;
            while (m.find()) {
               counter++;
            }
            str = str.replaceAll("abc", "");
            System.out.println(counter);
            System.out.println(str);
         }
      }

