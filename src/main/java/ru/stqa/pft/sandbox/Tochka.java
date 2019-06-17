package ru.stqa.pft.sandbox;

public class Tochka {
    public double pointX1;
    public double pointY1;
    public double pointX2;
    public double pointY2;

    public double rastoyanie(){
         //квадрат гипатинузы равен сумме квадратов катетов. Пересчитываем начало координат на точку 1. и считаем расстояние от нуля до второй точки
        this.pointX2 = this.pointX2 - this.pointX1;
        this.pointY2 = this.pointY2 - this.pointY1;
        return Math.sqrt((this.pointX2 * this.pointX2) + (this.pointY2 * this.pointY2));

    }
    public Tochka(double pointX1, double pointY1, double pointX2, double pointY2){
        this.pointX1 = pointX1;
        this.pointY1 = pointY1;
        this.pointX2 = pointX2;
        this.pointY2 = pointY2;
    }
}
