package HomeworkWeek7;
//Write a java program to input any year like(2007)and find out it is leap year or not

import java.util.Scanner;//call scanner
public class Leapyear2 {
    //main method
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        year = scan.nextInt();
        scan.close();
        boolean Leapyear = false;

        if (year % 4 == 0) {   //logic for leap year
            Leapyear = true;}
            else{
            Leapyear = false;
        }

        if (Leapyear == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");


    }
}