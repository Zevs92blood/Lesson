package ru.stqa.pft.sandbox;

public class Tochka {
    public double point1;
    public double point2;

    public double rastoyanie(){
        if (point1 > point2) return this.point1 - this.point2; //реализовал для линии надо для прощади... квадрат гипатинузы равен сумме квадратов катетов.
        else return this.point2 - this.point1;

    }
    public Tochka(double point1, double point2){
        this.point1 = point1;
        this.point2 = point2;
    }
}
