package com.company;

public class Main {

    public static void main(String[] args) {
        Grandfa grandfa = new Grandfa("aziz", "azizov", 50, SkinColour.BLACK);
        grandfa.getInfo();
        grandfa.hobby("dance", 5);
        System.out.println("--------------------------------------------");

        Father father = new Father("shama", "shamov", 30, "gos", 25000, SkinColour.WHITE);
        father.getInfo();
        father.hobby("sing", 6);
        System.out.println("--------------------------------------------");

        FizDan fizDan = new FizDan(180.5);
        FizDan fizDan1 = new FizDan(187);

        Son son = new Son("azat", "azatov", 50, "IT", 50000, 2, SkinColour.BROWN, fizDan);
        son.getInfo();
        son.hobby("borba");
        son.hobby(5);
        System.out.println("--------------------------------------------");
        System.out.println("копия объекта son");
        System.out.println();

        Son son2 = new Son();
        son2.copy(son);


    }
}
