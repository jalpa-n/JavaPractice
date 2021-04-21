package Datatype;

public class constructorPractice {
    //instance variable or global variable
    int a;
    String name;

    public constructorPractice(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public void mymethod() {
        System.out.println(a);
        System.out.println(name);
    }

    public void main(String[] args) {


        constructorPractice obj = new constructorPractice(10, "prime");
        //obj1 = mymethod();

    }
}