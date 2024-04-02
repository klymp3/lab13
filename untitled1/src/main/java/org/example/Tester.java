package org.example;

import java.lang.reflect.Method;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private Float salary;

    public Tester() {this("-", "-");}
    public Tester(String name, String surname) {this(name, surname, 0, "-", 0f);}
    public Tester(String name, String surname, int expirienceInYears, String englishLevel, Float salary){
        this.name=name;
        this.surname=surname;
        this.expirienceInYears=expirienceInYears;
        this.englishLevel=englishLevel;
        this.salary=salary;
    }

    public void Method(){System.out.println(name+"\n"+surname+"\n"+expirienceInYears+"\n"+englishLevel+"\n"+salary+"\n");}
    public void Method(String s){System.out.println(s+"\n");}
    public void Method(String s1, String s2)
    {
        System.out.print("s1=");
        Method(s1);
        System.out.print("s2=");
        Method(s2);
    }

    public static int m(int i){
        return i++;
    }
}
