package HomeworkWeek7;
/*3. Write a java program to input student Name, roll No, and three subjects Math, Science and
    English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
    Input, Marks should between 0 to 100”) and find out total, percentage and result.
    If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
    %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     _______________________________
    |                               |
    |        Mark Sheet             |
    |_______________________________|
    |        Name   : Jay           |
    |       Roll No : 08            |
    |_______________________________|
    |      Subjects : Marks         |
    |_______________________________|
    |        Math   : 98            |
    |       Science : 90            |
    |       English : 85            |
    |_______________________________|
    |       Total   : 273           |
    |_______________________________|
    |    Percentage : 91.0          |
    |       Result  : Pass          |
    |       Grade   : A+            |
    |_______________________________| */

import java.util.Scanner;
public class Marksheet3 {



        //Instance Method
        String name;
        int rollno, maths, science, english, total, percentage;

        //Instance Method
        public void studentresult() {

            String addstr = "|_______________________________|";
            System.out.println(" _______________________________");
            System.out.println("|                               |");
            System.out.println("|        Mark Sheet             |");
            System.out.println(addstr);

            Scanner s1 = new Scanner(System.in);
            System.out.print("|        Name   : ");
            name = s1.nextLine();
            //System.out.println("          |");

            System.out.print("|       Roll No : ");
            rollno = s1.nextInt();
            System.out.println(addstr);
            System.out.println("|      Subjects : Marks         |");
            System.out.println(addstr);
            System.out.print("|        Math   : ");
            maths = s1.nextInt();
            if (maths < 0 || maths > 100) {

                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.print("|        Math   : ");
                maths = s1.nextInt();
            }

            System.out.print("|       Science : ");
            science = s1.nextInt();
            if (science < 0 || science > 100) {

                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.print("|       Science : ");
                science = s1.nextInt();
            }

            System.out.print("|       English : ");
            english = s1.nextInt();
            if (english < 0 || english > 100) {

                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.print("|       English : ");
                english = s1.nextInt();
            }
            System.out.println(addstr);

            total = maths + science + english;
            System.out.println("|       Total   : " + total + "           |");

            System.out.println(addstr);

            percentage = total * 100 / 300;
            System.out.println("|    Percentage : " + percentage + "            |");

            if (maths >= 35 && science >= 35 && english >= 35 && percentage >= 35) {

                System.out.println("|       Result  : Pass          |");

            } else {

                System.out.println("|       Result  : Fail          |");
            }
            if (percentage >= 80) {

                System.out.println("|       Grade   : A+            |");

            } else if (percentage >= 60 && percentage < 80) {

                System.out.println("|       Grade   : A             |");

            } else if (percentage >= 50 && percentage < 60) {

                System.out.println("|       Grade   : B             |");

            } else if (percentage >= 35 && percentage < 50) {

                System.out.println("|       Grade   : C             |");

            }
            System.out.println(addstr);
        }




    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Student Result template");
        Marksheet3 res = new Marksheet3(); //create object
        res.studentresult(); //call instance method in main method via object
        System.out.println("");
    }
}
