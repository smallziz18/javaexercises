package com.point;

public class Point {


    private double abscisse;
    private double ordonee;
    private byte couleur;

    public Point(double abscisse, double ordonee, byte couleur) {
       this(abscisse,ordonee);
        this.couleur = couleur;
    }

    public Point(double abscisse, double ordonee) {
        this.abscisse = abscisse;
        this.ordonee = ordonee;
    }

    public Point() {
        this.abscisse=0;
        this.ordonee=0;
        this.couleur=0;
    }
    public void  translater(double x, double y)
    {
        this.abscisse +=x;
        this.ordonee+=y;
    }
    public void affiche()
    {
        System.out.println("ce poit à pour abscisse:"+this.abscisse+" et pour ordonnée:"+this.ordonee );
    }
    public boolean coincide(Point point)
    {
        return (this.abscisse == point.abscisse && this.ordonee == point.ordonee);
    }



}
