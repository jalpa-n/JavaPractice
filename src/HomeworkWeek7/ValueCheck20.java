package HomeworkWeek7;
//20. Write a Java program to test if an array contains a specific value

import java.util.Arrays;
import java.util.Scanner;

public class ValueCheck20 {
    public boolean checkValue() {

        int length, checkValue1;  //Local variable

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        length = input.nextInt();
        int num[] = new int[length];

        System.out.println("Enter the value for array: ");

        for (int i = 0; i < length; i++) {

            num[i] = input.nextInt();

        }

        System.out.println(Arrays.toString(num));

        System.out.println("Enter the value for check");
        checkValue1 = input.nextInt();

        for (int n : num) {

            if (checkValue1 == n) {

            }
            return true;
        }

        return false;

    }
        public static void main(String[]args){
            System.out.println("Program 20");
            System.out.println();
            System.out.println("Check array contains any specific value?");

            ValueCheck20 value = new ValueCheck20();

            if (value.checkValue() == true) {

                System.out.println("Array contains entered value");

            } else {
                System.out.println("Array does not contains entered value");

            }

        }
    }


