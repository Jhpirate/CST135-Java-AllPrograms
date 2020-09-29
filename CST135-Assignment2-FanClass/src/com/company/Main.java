// Author: Jared Heeringa
// Date: 09/15/2020
// Project: Assignment #1 - Person class
// Class: CST135

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Person person1 = new Person();

    person1.setName("Jared");

    System.out.println(person1.getName());

    person1.toPrint();

    }
}

class Person {
    private String name;
    private int age;
    private String gender;
    private int height;
    private String address;
    private String email;
    private String phoneNum;

    Person(){
        name = "-- Not Set --";
        age = 0;
        gender = "-- Not Set --";
        height = 0;
        address = "-- Not Set --";
        email = "-- Not Set --";
        phoneNum = "-- Not Set --";
    }

    Person(String p_name, int p_age, String p_gender, int p_height, String p_address, String p_email, String p_phoneNum){
        name = p_name;
        age = p_age;
        gender = p_gender;
        height = p_height;
        address = p_address;
        email = p_email;
        phoneNum = p_phoneNum;
    }

    public void setName(String p_name){
        name = p_name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int p_age){
        age = p_age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String p_gender){
        gender = p_gender;
    }

    public String getGender(){
        return gender;
    }

    public void setHeight(int p_height){
        height = p_height;
    }

    public int getHeight(){
        return height;
    }

    public void setAddress(String p_address){
        address = p_address;
    }

    public String getAddress(){
        return address;
    }

    public void setEmail(String p_email){
        email = p_email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNum(String p_phoneNum){
        phoneNum = p_phoneNum;
    }

    public String getPhoneNum(){
        return  phoneNum;
    }

    public void toPrint(){
        System.out.println("\n--- START OBJECT DETAILS ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone #: " + phoneNum);
        System.out.println("--- END OBJECT DETAILS ---\n");
    }
}