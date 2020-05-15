package com.carambula;

public class Main {


    public static void main(String[] args) {
//        O1 = -
//        C = 0
//        O2 = /
//        i, j - char
        final int C = 0;
        char a = 'a', b = 'b', m = 'm', n = 'n';
        double S = 0;
        if (a > n || b > m) {
            System.out.println("Wrong borders");
            return;
        } else if (a <= C && n >= C || b <= 0 && m >= 0) {
            System.out.println("Division by 0");
            return;
        }
        for (char i = a; i <= n; i++) {
            for (char j = b; j <= m; j++) {
                S +=  ((double)i / j) / (i - C);
            }
        }
        System.out.println(S);
    }
}
