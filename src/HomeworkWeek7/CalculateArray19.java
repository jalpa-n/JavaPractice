package HomeworkWeek7;
//19. Write a Java program to calculate the average value of array elements.

import java.util.Arrays;
import java.util.Scanner;

public class CalculateArray19 {
    int num[], length;

    public void avgArray() {

        int sum = 0, avg;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        length = input.nextInt();
        int num[] = new int[length];
        System.out.println("Enter the value for array: ");

        for (int i = 0; i < length; i++) {

            num[i] = input.nextInt();
            sum = sum + num[i];
        }
        avg = sum / length;
        System.out.println(Arrays.toString(num));
        System.out.println("Average of value of an array is = " + avg);
    }
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Average of value of an array");
        CalculateArray19 avg1 = new CalculateArray19();  //create object
        avg1.avgArray();  //call avgArray method via object
        //  avg1.avgArray();  //call avgArray method via object
        System.out.println("");
    }
    }
