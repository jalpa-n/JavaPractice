package HomeworkWeek7;
//write a java program to input any number and find out if it is odd or even

import java.util.Scanner;

public class Oddeven_6 {

    public static void main(String args[]) {
        int num;
        System.out.println("Enter a number:");

        //The input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        if (num % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}

