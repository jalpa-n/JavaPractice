package Homework;
/**
 * Declare two instance variable
 * declare one instance method
 * Call both instance variable into the instance method inside the print statement
 * Declare the main method
 * Declare Above instance method into the main method
 */

public class InstanceVandM {
    //Declare instance variable
    int a = 15;
    int b = 10;


    // Instance Method
    void IM() {
        //call instance variable
        System.out.println(a);
        System.out.println(b);
    }

    //Main method
    public static void main(String[] args) {
    //object create to call main method

    InstanceVandM intIM = new InstanceVandM();

    //Print statement
        System.out.println(intIM.a);
        System.out.println(intIM.b);


    }
}