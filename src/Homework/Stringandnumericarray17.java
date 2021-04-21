package Homework;
// 17. Write a Java program to sort a numeric array and a string array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stringandnumericarray17 {
    Stringandnumericarray17(){
            int num[]={23,98,65,49,73,26,69,9,4,7};

            String str[]={"class","object","constructor","method","variable","encapsulation","polymorphism"};

            Arrays.sort(num);  //sort in ascending order
            System.out.println("Sort numeric array in ascending order: "+Arrays.toString(num));

            Arrays.sort(str); //sort String in ascending
            System.out.println("Sort string  array in ascending order: "+Arrays.toString(str));


            // Arrays.sort(num, Collections.reverseOrder());
            //System.out.println(" Collection.sort()  :\n" + colList);*/

        }
        
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Sort an array");
        Stringandnumericarray17 obj1 = new Stringandnumericarray17();
        System.out.println("");
    }
}