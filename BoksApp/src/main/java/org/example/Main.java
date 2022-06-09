package org.example;

public class Main {
    public static void main(String[] args) {
        Fighter f1 =new Fighter("AB",25,120,200,25);
        Fighter f2 =new Fighter("AC",15,150,240,45);
         Ring match=new Ring(f1,f2,200,260);
         match.run();
    }
}