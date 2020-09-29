package assignment6;

public class PersonClassTester {
    public static void main(String[] args){
        Person person1 = new Person("Jane", "Smith");
        Person person2 = new Person("John", "Doe");
        Person person3 = new Person(person1);

        //test equality of person1 and person2
        if(person1.equals(person2)){
            System.out.println("Person1 and Person 2 ARE the same!");
        } else {
            System.out.println("Person1 and Person 2 are NOT the same!");
        }

        //test equality of person1 and person3
        if(person1.equals(person3)){
            System.out.println("Person1 and Person 3 ARE the same!");
        } else {
            System.out.println("Person1 and Person 3 are NOT the same!");
        }

        //toString
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
