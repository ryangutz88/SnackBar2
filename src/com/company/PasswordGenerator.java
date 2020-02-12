//Ryan Gutierrez
//3B
//APCS
package com.company;

public class PasswordGenerator {
    String prefix;
    private int digitalLength;
    private int randomDigits;
    private static int count = 0;
    public PasswordGenerator(int a, String b){
        digitalLength = a;
        prefix = b;
    }
    public PasswordGenerator(int a){
        digitalLength = a;
        prefix = "A";
    }
    public String pwGen() {
        randomDigits = (int) (Math.random() * Math.pow(10, digitalLength));
        String a = prefix + "." + randomDigits;
        count++;
        return a;
    }
    public int pwCount(){
        return count;
    }
    public static void main(String [] args){
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        PasswordGenerator pw2 = new PasswordGenerator(5);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}

/*
0
chs.7952
1
chs.4919
2
A.59326
3
3

Process finished with exit code 0
*/
