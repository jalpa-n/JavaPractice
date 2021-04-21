package HomeworkWeek7;

//16.Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Checknumber16 {

    long num; //Global variable

    //Instance method

    public void number() {

        Scanner num1 = new Scanner(System.in); //create object
        System.out.println("Enter the number:");
        num = num1.nextLong();

        if (num < 0) {

            System.out.println(num + " is negative number");
        } else if (num > 0) {

            System.out.println(num + " is positive number");

        } else {
            System.out.println("Number is zero");
        }
    }

    //Main method
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Input number is positive,negative or zero");
        Homework.Checknumber numb = new Homework.Checknumber();  //create object
        numb.number();  //call instance method in main method via object
        System.out.println("");
    }
}




