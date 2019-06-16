package ru.stqa.pft.sandbox;

public class MyProgram
{

    public static void main (String[] args) {

        double storonaK = 6;
        double a = 4;
        double b = 6;

        String slovo = "Площадь фигуры со стороной ";
        hello("peple");
        System.out.println(slovo + storonaK + " = " + plosch(storonaK));
        System.out.println(slovo + a + " и " + b + " = " + plosch(a, b));
    }
    public static void hello(String priv){

        System.out.println("Hi " + priv);
    }
    public static double plosch(double storonaKvadrata) {
        return storonaKvadrata * storonaKvadrata;
    }

    public static double plosch(double storonaA, double storonaB) {
        return storonaA * storonaB;
    }
}

