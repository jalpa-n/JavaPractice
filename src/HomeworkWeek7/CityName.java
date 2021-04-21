package HomeworkWeek7;
//*
// Input any alphabet from "A" to "F" and print their city name accordingly(use if else)
//if any other alphabet should be invalid entry.
//import java.util.Scanner;

import java.util.Scanner;

public class CityName {

    public static void letter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter city name: ");
        char city = scan.next().charAt(0);

        if (city == 'A'||city=='a') {
            System.out.println("City name is Ahmedabad");
        } else if (city == 'B' ||city=='b') {
            System.out.println("City name is Baroda");
        } else if (city == 'C'|| city=='c') {
            System.out.println("City name is Channai");
        } else if (city == 'D'|| city=='d') {
            System.out.println("City name is Darjiling");
        } else if (city == 'E'|| city=='e') {
            System.out.println("City name is Easanpur");
        } else if (city == 'F'|| city=='f') {
            System.out.println("City name is faridabad");
        } else
        {
            System.out.println("City name is Invalid Entry");
        }
    }
    public static void main(String[] args) {
        letter();
    }
}
