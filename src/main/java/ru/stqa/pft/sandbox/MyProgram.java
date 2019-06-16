package ru.stqa.pft.sandbox;

public class MyProgram
{

    public static void main (String[] args) {

        Kvadrat ploschad = new Kvadrat(6);


        Pryamoug pl = new Pryamoug(4, 6);


        String slovo = "Площадь фигуры со стороной ";
        hello("peple");
        System.out.println(slovo + ploschad.storona + " = " + plosch(ploschad));
        System.out.println(slovo + pl.storonaA + " и " + pl.storonaB + " = " + plosch(pl));
    }
    public static void hello(String priv){

        System.out.println("Hi " + priv);
    }
    public static double plosch(Kvadrat ploschad) {
        return ploschad.storona * ploschad.storona;
    }

    public static double plosch(Pryamoug pl) {
        return pl.storonaA * pl.storonaB;
    }
}

