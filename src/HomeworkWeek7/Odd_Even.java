package HomeworkWeek7;
// 1> write a java program that tell us input number is odd or even
//call scanner
import java.util.Scanner;

//static method

public class Odd_Even {

    public static void main(String[] args) {

        Scanner reader =new Scanner(System.in);//use scanner
        System.out.println();
        int num =reader.nextInt();

        // If number is divisible by 2 then it's an even number
        // else odd number
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
    }
}
