package Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        input.nextInt();
        int a=30;
        int b=10;
        double result;
        Calculator cal = new Calculator();
       result = cal.addition(a,b);
       System.out.println(result);
    }
}
