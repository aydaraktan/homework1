package com.company;

public class Father extends Grandfa{

    private String work;
    private int salary;

    public Father(String name, String lastName, int age,String work, int salary,SkinColour skinColour) {
        super(name, lastName, age,skinColour);
        this.work=work;
        this.salary=salary;

    }

    public Father() {
        super();
    }


    public String getWork() {
        return work;
    }

    public int getSalary() {
        return salary;
    }
    public void getInfo()
    {
        super.getInfo();
        System.out.println("зарплата "+getSalary()+"\nтип работы "+getWork());

    }
    public void hobby(String hobbyType,int years)
    {
        System.out.println("хобби "+hobbyType+" \nзанималься "+years+" лет");
    }
    public void hobby(String hobbyType)
    {
        System.out.println("хобби "+hobbyType+" \nзанималься ");
    }
    public final void hobby(int years)
    {
        System.out.println("занималься "+years+" лет");
    }

}
