package HomeworkWeek7;

public class Numberofdays4 {
    public static boolean isLeapYear(int year) {

        boolean result;  //Local variable

        if ((year >= 1 && year <= 9999) && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

            result = true;
            System.out.println(result);

        } else {

            result = false;
            System.out.println(result);
        }

        return result;

    }
    //Static method with return type with parameters

    public static int getDaysInMonth(int month, int year) {

        int days = 0;


        if (month < 1 || month > 12 || year < 1 || year > 9999) {

            days = -1;

        } else {

            switch ( month ) {

                case 1:
                    days = 31;
                    break;

                case 2:
                    //a= isLeapYear(year); //call method direct
                    if (isLeapYear(year) == true) {

                        days = 29;
                        break;

                    } else {

                        days = 28;
                        break;
                    }
                case 3:
                    days = 31;
                    break;

                case 4:
                    days = 30;
                    break;

                case 5:
                    days = 31;
                    break;

                case 6:
                    days = 30;
                    break;

                case 7:
                    days = 31;
                    break;

                case 8:
                    days = 31;
                    break;

                case 9:
                    days = 30;
                    break;

                case 10:
                    days = 31;
                    break;

                case 11:
                    days = 30;
                    break;

                case 12:
                    days = 31;
                    break;

            }

        }

        return days;
    }


    // System.out.println("Program 4");
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Find how many days in month");
        System.out.println(Numberofdays4.getDaysInMonth(2, 2020)); //call static method via class name
        System.out.println("");
    }
}