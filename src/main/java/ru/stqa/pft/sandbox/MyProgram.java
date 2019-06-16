package ru.stqa.pft.sandbox;

public class MyProgram
{

    public static void main (String[] args) {

        Kvadrat ploschad = new Kvadrat(5);


        Pryamoug pl = new Pryamoug(4, 6);


        String slovo = "Площадь фигуры со стороной ";
        hello("peple");
        System.out.println(slovo + ploschad.storona + " = " + ploschad.plosch());
        System.out.println(slovo + pl.storonaA + " и " + pl.storonaB + " = " + pl.plosch());
    }
    public static void hello(String priv){

        System.out.println("Hi " + priv);
    }



}

