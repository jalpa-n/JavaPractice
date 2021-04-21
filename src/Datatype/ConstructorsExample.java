package Datatype;

public class ConstructorsExample {

    //constructor
    //zero argument constructor

    public ConstructorsExample() {
        System.out.println("zero argument constructor created by user");
    }

    // one argument constructor
    public ConstructorsExample(int a) {

    }

    // Two args constructor
    public ConstructorsExample(int a, int b) {
        System.out.println("one argument constructor created");

    }

    {

    }

    //method
    //public void addition(){

    //}

    public static void main(String[] args) {   //main method

        ConstructorsExample obj = new ConstructorsExample(); //onstructorsExample();//zero args constructor is called
        ConstructorsExample obj1 = new ConstructorsExample(10);//one args constructor is called
        ConstructorsExample obj2 = new ConstructorsExample(10, 15);//one args constructor is called

        ConstructorsExample obj3 = new ConstructorsExample();//one args constructor is called


    }
}