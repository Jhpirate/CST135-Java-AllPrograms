package assignment7;

import java.awt.*;

public class Person implements PersonInterface, Comparable{
    //initialize variables
    private String firstName;
    private String lastName;
    public boolean running;

    //default no arg constructor
    public Person() {
        this.firstName = "-- Not Set --";
        this.lastName = "-- Not Set --";
    }

    //constructor with args
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //copy constructor
    public Person(Person person){
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
    }

    @Overide
    public boolean equals(Object other){
        if(other == this){
            System.out.println("I am here in other == this");
            return true;
        }
        if(other == null){
            System.out.println("I am here in other == null");
            return false;
        }
        if(getClass() != other.getClass()){
            System.out.println("I am here in getClass() != other.getClass()");
            return false;
        }

        Person person = (Person) other;
        return (this.firstName == person.firstName && this.lastName == person.lastName);
    }

    @Overide
    public String toString(){
        return "My class is: " + getClass() + "  " + this.firstName + " " + this.lastName;
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
        running = false;
    }

    @Override
    public void run() {
        System.out.println("I am Running");
        running = true;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int compareTo(Person p){
        int value = this.lastName.compareTo(p.lastName);

        if(value == 0){
            return this.firstName.compareTo(p.firstName);
        } else {
            return value;
        }
    }

    @Override
    public int compareTo(Object o) {
        int value = this.lastName.compareTo(((Person) o).lastName);

        if(value == 0){
            return this.firstName.compareTo(((Person) o).firstName);
        } else {
            return value;
        }
    }
}
