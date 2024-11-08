package com.mycompany.verdaderofalso;

public class VerdaderoFalso {
    public static void main(String[] args) {
     
        int M = 6;
        int T = 1;
        int K = -10;

        boolean expr1 = M > T;  
        boolean expr2 = (K != 0) && (T / K == -5);  
        boolean expr3 = (M + T == 7) || (M - T == 5);  

        System.out.println("M > T: " + expr1);
        System.out.println("T / K == -5: " + expr2);
        System.out.println("(M + T == 7) || (M - T == 5): " + expr3);
    }
}
