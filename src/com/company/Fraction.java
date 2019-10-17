package com.company;

public class Fraction {

    private final int numerateur;
    private final int denominateur;

    Fraction(int n, int d)
    {
        this.numerateur=n;
        this.denominateur=d;

    }
    Fraction(int n)
    {
        this.numerateur=n;
        this.denominateur=1;
    }

    Fraction()

    {
        this.numerateur=0;
        this.denominateur=1;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public double getValue(){
        double res=(getDenominateur()/getNumerateur());
        return res;
    }
}
