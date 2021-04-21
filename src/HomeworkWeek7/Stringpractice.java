package HomeworkWeek7;
import java.util.Locale;
public class Stringpractice {

    public void strPractice() {

        String str1 = "JAVA";
        String str2 = "Diary";
        String str3 = "  Java Travel Planner    ";

        System.out.println("First string: " + str1);
        System.out.println("Second string: " + str2);
        System.out.println("Third string: " + str3);
        System.out.println();

        System.out.print("Length of the First string is : ");
        System.out.println(str1.length()); //length of string
        System.out.println();

        System.out.println("Character at 3rd index from the First string is: " + str1.charAt(3));  //return the value at 3
        System.out.println();

        System.out.println("Concatenation of First and Second string is: " + str1.concat(" " + str2)); //combine string str1 and str2
        System.out.println();

        System.out.println("Is First string contains 'AV': " + str1.contains("AV"));   //check str1 contains "AV"
        System.out.println();

        System.out.println("Is First string start with 'J': " + str1.startsWith("J"));  //check str1 start with "J"
        System.out.println();

        System.out.println("Is First string ends with 'v': " + str1.endsWith("V"));     //check str1 end with "V"
        System.out.println();

        System.out.println("Is First string and second string equal?: " + str1.equals(str2)); //check str1 and str2 is equal?
        System.out.println();

        System.out.println("Index of character 'r' from second string: " + str2.indexOf("r")); //return the index of "r"
        System.out.println();

        System.out.println("Second string is Empty? :" + str2.isEmpty());           //check str2 is empty?
        System.out.println();

        System.out.println("a is replace by A in Second string :" + str2.replace("a", "A")); //replace"a" by "A"
        System.out.println();

        System.out.println("Substring of third string from index 7 to 13: " + str3.substring(7, 13)); //return sub string from index 7 to 13
        System.out.println();

        System.out.println("Convert second string into character array: " + str2.toCharArray()); //convert string into character array
        System.out.println();

        System.out.println("Convert first string into lower case: " + str1.toLowerCase());  //convert string str1 into lower case
        System.out.println();

        System.out.println("Convert second string into upper case: " + str2.toUpperCase()); //covert str2 into upper case
        System.out.println();

        System.out.println("Eliminate leading and trailing spaces from the third string: " + str3.trim());    //trim the space from str3

    }

    public static void main(String[] args) {

        Stringpractice str = new Stringpractice();  //create object
        str.strPractice();  //call strPractice in main method

    }


}