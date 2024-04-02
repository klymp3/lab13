package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tester t = new Tester();
        t.Method();
        t.Method("Второй метод");
        t.Method("Третий метод", "(вызывающий второй)");
        System.out.println(Tester.m(9));
    }
}
