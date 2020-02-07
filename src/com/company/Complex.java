package com.company;

public class Complex {
    double far;
    double rar;

    public Complex(double a){
        far = a;
        rar = 0.0;
    }
    public Complex(double a, double b){
        far = a;
        rar = b;

    }
    public double abs (){
        double result = Math.sqrt((far*far)+ (rar*rar));
        return result;
    }
    public Complex add (Complex other){
        double addfart = far + other.far;
        double addrart = rar + other.rar;
        return new Complex(addfart, addrart);
    }
    public String toString(){
        String result = far + "+" + rar + "i";
        return result;
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
