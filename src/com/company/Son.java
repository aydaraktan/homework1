package com.company;

public final class Son extends Father {
    private int dayOff;
    private FizDan fizDan;

    public Son(String name, String lastName, int age, String work, int salary, int dayOff, SkinColour skinColour, FizDan fizDan) {
        super(name, lastName, age, work, salary, skinColour);
        this.dayOff = dayOff;
        this.fizDan = fizDan;
    }

    public Son() {
        super();
    }

    public int getDayOff() {
        return dayOff;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("\nвыходной " + getDayOff() + "\nрост " + fizDan.getRost());
    }

    public final void hobby(String hobbyType) {
        System.out.println("хобби " + hobbyType);
    }

    public void copy(Son son) {
        son.getInfo();
    }


}
