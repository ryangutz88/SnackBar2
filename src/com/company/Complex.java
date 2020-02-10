package com.company;

public class Complex {
    double far;
    double rar;

    public Complex(double a){
        first = a;
        second = 0.0;
    }
    public Complex(double a, double b){
        first = a;
        second = b;

    }
    public double abs (){
        double result = Math.sqrt((far*far)+ (rar*rar));
        return result;
    }
    public Complex add (Complex other){
        double addfirst = first + other.first;
        double addsecond = second + other.second;
        return new Complex(addfirst, addsecond);
    }
    public String toString(){
        String result = far + "+" + rar + "i";
        return result;
    }
    public Complex multiply(Complex other){
        double multiplyfirst = first * other.second * other.first;
        double multiplysecond = second * other.first * other.second;
        double

    }
    public static void main(String[] args){
        Complex p =  new Complex(7.2, 18.5);
        System.out.println(p.abs());
        Complex s = new Complex(9.0,6.0);
        System.out.println(s.add(p));
        System.out.println(p);
        System.out.println(s);

    }

}
