package com.company;

public class Complex {
    double first;
    double second;

    public Complex(double a){
        first = a;
        second = 0.0;
    }
    public Complex(double a, double b){
        first = a;
        second = b;

    }
    public double abs (){
        double result = Math.sqrt((first*first)+ (second*second));
        return result;
    }
    public Complex add (Complex other){
        double addfirst = first + other.first;
        double addsecond = second + other.second;
        return new Complex(addfirst, addsecond);
    }
    public String toString(){
        String result = first + "+" + second + "i";
        return result;
    }
    public Complex multiply(Complex other){
        double multiplyfirsts = (first * other.first) - (second * other.second);
        double multiplyseconds = (first * other.second) + (other.first * second);
        return new Complex(multiplyfirsts, multiplyseconds);

    }
    public static void main(String[] args){
        Complex p =  new Complex(7.2, 18.5);
        System.out.println(p.abs());
        Complex s = new Complex(9.0,6.0);
        System.out.println(s.add(p));
        System.out.println(p);
        System.out.println(s);
        System.out.println(s.multiply(p));

    }

}
