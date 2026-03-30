package com.example;

public class Triangle {
    public static double calcArea(double aSide, double bSide, double cSide) {
        double s = (aSide + bSide + cSide) / 2;
        double area = Math.sqrt( s*(s-aSide)*(s-bSide)*(s-cSide));
        return area;
    }
}
