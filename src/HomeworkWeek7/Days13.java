package HomeworkWeek7;

/**
 * write a java program Which input any number between 1 to 7 and it print the days
 * name MONDAY, TUESDAY......SUNDAY of the week accordingly by using switch statement.
 * NOTE: if number is out of selection Print message "Week contains 1 to 7 days"
 */

//main method
public class Days13{

    public static void main(String args[]) {
        int days = 3;
        switch (days) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Invalid input - Wrong day number.");
                break;
        }
    }
}