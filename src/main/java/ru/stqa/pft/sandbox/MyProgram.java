package ru.stqa.pft.sandbox;

public class MyProgram
{

    public static void main (String[] args) {

        Kvadrat plK = new Kvadrat(5, "Площадь квадрата со стороной ");


        Pryamoug plP = new Pryamoug(4,6, "Площадь прямоугольника со сторонами ");

        Tochka distance = new Tochka(-3, -4);


        hello("peple");
        System.out.println(plK.figura + plK.storona + " = " + plK.plosch());
        System.out.println(plP.figura + plP.storonaA + " и " + plP.storonaB + " = " + plP.plosch());
        System.out.println("Дистанция между точками " + distance.rastoyanie());
    }
    public static void hello(String priv){

        System.out.println("Hi " + priv);
    }



}

