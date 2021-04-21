package HomeworkWeek7;

import java.util.Scanner;

public class SwitchStatement9 {
    static void name() {

        char city;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter city name: ");
        city = scan.next().charAt(0);

        switch (city) {
            case 'A' : //city = 'A';
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Channai");
                break;
            case 'D':
                System.out.println("Darjiling");
                break;
            case 'E':
                System.out.println("Easenpur");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) {
        name();
    }
}


