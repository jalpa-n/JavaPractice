package HomeworkWeek7;
/*7. Write a java program input sales id, seller's name, sales amount, and salary basic and
    then fined this sales
    Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
    >= 20,000 10%
    >= 10,000 5%
    < 10,000 2% */

import java.util.Scanner;
public class Sale7 {
        //Instance method
        public void sale() {

            int salesId, salesAmount, basicSalary, commission; //Local variable
            String name;   //Local variable

            Scanner s = new Scanner(System.in);
            System.out.print("Enter sales ID: ");
            salesId = s.nextInt();
            System.out.print("Enter seller's name: ");
            name = s.next();
            System.out.print("Enter sales amount: ");
            salesAmount = s.nextInt();
            System.out.print("Enter basic salary: ");
            basicSalary = s.nextInt();

            //Logic for find sales commission

            if (salesAmount >= 50000) {

                commission = salesAmount * 35 / 100;
                System.out.println("Sales Commission= " + commission);

            } else if (salesAmount >= 30000 && salesAmount < 50000) {

                commission = salesAmount * 20 / 100;
                System.out.println("Sales Commission= " + commission);

            } else if (salesAmount >= 20000 && salesAmount < 30000) {

                commission = salesAmount * 10 / 100;
                System.out.println("Sales Commission= " + commission);

            } else if (salesAmount >= 10000 && salesAmount < 20000) {

                commission = salesAmount * 5 / 100;
                System.out.println("Sales Commission= " + commission);

            } else {

                commission = salesAmount * 2 / 100;
                System.out.println("Sales Commission= " + commission);

            }

        }
        public static void main(String[] args) {
            System.out.println("");
            System.out.println("Find sales commission");
            Sale7 com = new Sale7(); //create object
            com.sale(); //call instance method in main method via object
            System.out.println("");

        }
}