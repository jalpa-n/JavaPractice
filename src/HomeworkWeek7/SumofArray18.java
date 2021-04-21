package HomeworkWeek7;
//18. Write a Java program to sum values of an array.

import java.util.Scanner;
import java.util.Arrays;

public class SumofArray18 {

    int num[] , length;

    public void sumArray() {

        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        length = input.nextInt();
       int num[] = new int[length];
        System.out.println("Enter the value for array: ");

        for (int i = 0; i < length; i++) {

          num[i] = input.nextInt();
            sum = sum + num[i];  //Logic for sum of array
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Sum of value of an array is = " + sum);
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("sum of value of an array:");
        SumofArray18 sum=new SumofArray18();  //create object
       sum.sumArray();  //call sumArray method via object
       System.out.println("");

    }
}