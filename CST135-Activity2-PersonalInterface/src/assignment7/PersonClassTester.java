package assignment7;

import java.util.Arrays;

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

        person1.walk();
        person1.run();
        System.out.println("Person 1 is running: " + person1.isRunning());
        person1.walk();
        System.out.println("Person 1 is running: " + person1.isRunning());


        Person[] persons = new Person[6];
        persons[0] = new Person("John", "Smith");
        persons[1] = new Person("Jeff", "Fletcher");
        persons[2] = new Person("Mike", "McFly");
        persons[3] = new Person("Addy", "Anderson");
        persons[4] = new Person("Peter", "Griffin");
        persons[5] = new Person("Favio", "Aberto");

        Arrays.sort(persons);

        for(int i=0; i<6; i++){
            System.out.println(persons[i]);
        }
    }
}
