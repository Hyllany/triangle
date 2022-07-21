package com.epam.rd.autotasks.triangle;

class Triangle {
private double xStart;
private double xEnd;
private double yStart;
private double yEnd;
private double zStart;
private double zEnd;

    public Triangle(Point a, Point b, Point c) {
        xStart = a.getX();
        xEnd = a.getY();
        yStart = b.getX();
        yEnd = b.getY();
        zStart = c.getX();
        zEnd = c.getY();
double abSide = Math.sqrt(Math.pow(xStart - yStart, 2)+ Math.pow(yEnd - xEnd, 2));
double acSide = Math.sqrt(Math.pow(zStart - xStart, 2)+ Math.pow(zEnd - xEnd, 2));
double bcSide = Math.sqrt(Math.pow(zStart - yStart, 2)+ Math.pow(zEnd - yEnd, 2));
if(abSide + acSide < bcSide || acSide + bcSide < abSide || bcSide+abSide < acSide){
    throw new IllegalArgumentException();
}
double polper= (abSide + acSide + bcSide)/2;
if(abSide>=acSide && abSide>=bcSide && abSide == polper){
    throw new IllegalArgumentException();
}
if (acSide>=bcSide && acSide>=abSide && acSide==polper){
    throw new IllegalArgumentException();
}
if(bcSide>=abSide && bcSide>=acSide && bcSide==polper){
    throw new IllegalArgumentException();
}
    }

    public double area() {
        return (0.5 * Math.abs((xStart - zStart)*(yEnd - xEnd)-(xStart - yStart)*(zEnd - xEnd)));
    }

    public Point centroid(){
        return new Point ((xStart + yStart + zStart)/3, (xEnd + yEnd + zEnd)/3);
    }

}
