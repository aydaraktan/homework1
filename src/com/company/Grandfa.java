package com.company;

public class Grandfa {
    private String name;
    private String LastName;
    private int age;
    private SkinColour skinColour;

    public Grandfa(String name, String lastName, int age, SkinColour skinColour) {
        this.name = name;
        LastName = lastName;
        this.age = age;
        this.skinColour=skinColour;
    }

    public Grandfa() {

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public void getInfo()
    {
        System.out.println("имя "+getName()+" \nфамилия "+getLastName()+" \nвозраст "+getAge()+"\nцвет кожи "+
                skinColour);
    }
    public void hobby(String hobbyType,int years)
    {
        System.out.println("хобби "+hobbyType+" \nзанималься "+years+" лет");
    }



}
