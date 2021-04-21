package HomeworkWeek7;

// 11> Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

public class Division {
//Static method
    public static void main(String args[]) {
        System.out.print("\nDivided by 3: ");
        for (int i = 1; i < 100; i++)
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
           System.out.print("\nDivided by 5:");
        int i;
        for (i = 1; i < 100; i++)
                if (i % 5 == 0){
                    System.out.print(i + " ");
            }
        }
    }


