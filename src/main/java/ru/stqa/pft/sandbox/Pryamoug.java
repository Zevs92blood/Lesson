package ru.stqa.pft.sandbox;

public class Pryamoug {

    public double storonaA;
    public double storonaB;

    public Pryamoug(double storonaA, double storonaB){
        this.storonaA = storonaA;
        this.storonaB = storonaB;
    }
    public double plosch() {
        return this.storonaA * this.storonaB;
    }
}
