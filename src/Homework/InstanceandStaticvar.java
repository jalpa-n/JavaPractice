package Homework;

    /**
     * Declar
     * Two Instance variable and two static variable
     * Declare one instance method
     * Call all instance and static variable into both instance and static method
     * Declare the main method
     * Call both Instance and Static methods into the main method
     */

    public class InstanceandStaticvar {
        //Declaring Instance and static variable
        int a = 25;
        int b = 30;
        static int c = 35;
        static int d = 40;

        //Instance method
        void IM() {
            //Call Instance and Static variable into the instance method
            System.out.println(a);
            System.out.println(b);
            System.out.println(InstanceandStaticvar.c);
            System.out.println(InstanceandStaticvar.d);

        }

        //static method
        void IM1() {
            //create object to call instance variable to static method
            InstanceandStaticvar intc = new InstanceandStaticvar();
            System.out.println(a);
            System.out.println(b);
            System.out.println(InstanceandStaticvar.c);
            System.out.println(InstanceandStaticvar.d);

        }
        //main Method
        //call instance and static
public static void main(String[] args){
// Create object to call instance method in main method
    InstanceandStaticvar IM =new InstanceandStaticvar();
 //Call Instance and static method in main method
    System.out.println("");
   // intc.IM();
   // intd.IM1();

        }
    }



