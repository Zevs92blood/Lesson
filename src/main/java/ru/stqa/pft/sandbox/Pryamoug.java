package ru.stqa.pft.sandbox;

public class Pryamoug {

    public double storonaA;
    public double storonaB;
    public String figura;


    public Pryamoug(double storonaA, double storonaB, String figura){
        this.storonaA = storonaA;
        this.figura = figura;
        this.storonaB = storonaB;
    }
    public double plosch() {
        return this.storonaA * this.storonaB;
    }
}
