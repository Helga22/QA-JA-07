package com.academy;

public class Abonent {
    private long id = -1;
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public static void main(String[] args) {
        Abonent myAbo = new Abonent(1, "Alex", "AAA", 29, 'm');
        Abonent myAbo2 = new Abonent(2, "Helga", "HHH", 28, 'f');

        myAbo.print();
        myAbo2.print();
    }

    public Abonent(
            long id,
            String firstName,
            String lastName,
            int age,
            char gender
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;


    }

    public void print() {
        System.out.println("Your data: ");
        System.out.println(this.id);
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.gender);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
