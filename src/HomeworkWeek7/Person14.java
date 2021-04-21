package HomeworkWeek7;

public class Person14 {

    //Instance variable
    String firstName, lastName;
    int age;

    //Instance method

    public String getFirstName() {

        return firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public int getAge() {

        return age;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setAge(int age) {


        this.age = age;
        if (age < 0 || age > 100) {

            this.age = 0;

        }

    }


    public boolean isTeen() {

        //boolean a;

        if (age > 12 && age < 20) {

            return true;

        } else {

            return false;

        }
        //return a;
    }

    public String getFullName() {
        String str;

        if (firstName == null && lastName == null) {

            str = "";


        } else if (firstName != null && lastName == null) {

            str = firstName;

        } else if (lastName != null && firstName == null) {

            str = lastName;

        } else {

            str = firstName.concat(" " + lastName);
        }
        return str;
    }

    public static void main(String[] args) {

        Person14 person = new Person14();  //create object
        person.setFirstName(""); //firstName is set to empty string
        person.setLastName("");  //lastName is set to empty string
        person.setAge(10);   //age is set to 10
        System.out.println("FullName= " + person.getFullName());  //call getFullName method
        System.out.println("Teen=" + person.isTeen());  //call isTeen method
        person.setFirstName("Jalpa");  //firstName is set to "Nidhi"
        person.setAge(18);   //age is set to 18
        System.out.println("FullName= " + person.getFullName());
        System.out.println("Teen= " + person.isTeen());
        person.setLastName("Ganatra");  //lastName is set to "Lathiya"
        System.out.println("FullName= " + person.getFullName());
        System.out.println("");

    }
}