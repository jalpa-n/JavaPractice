package Homework;
/**
 * Declare Two static Variable
 * Declare One static Method
 * Call both variable into the static Method
 * Declare the main method
 * Call the static method into the main method
 */
public class StaticVandM {
    // Declare Two Static Variable
    static int a =30;
    static int b =40;

    // Static Method
    static void SM(){
        //call both static variable into main method
        System.out.println(a);
        System.out.println(b);

    }
    //Main Method
    public static void main(String[] args){
        //call static method direct into main method
        SM();

    }

}

