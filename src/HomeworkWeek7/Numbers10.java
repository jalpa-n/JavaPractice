package HomeworkWeek7;

import java.util.Scanner;

public class Numbers10
{

    public static void main(String[] args) {
        int numbera, numberb;
        char op;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        numbera = scan.nextInt();
        System.out.println("Enter second number");
        numberb = scan.nextInt();
        System.out.println("Enter Operator");
        op=scan.next().charAt(0);

        if(op=='+'){
            System.out.println("addition of two number = "+(numbera+numberb) );
        }
        if(op=='-'){
            System.out.println("addition of two number = "+(numbera-numberb) );
        }
        if(op=='/'){
            System.out.println("addition of two number = "+(numbera/numberb) );
        }
        if(op=='*'){
            System.out.println("addition of two number = "+(numbera*numberb) );
        }


    }

}