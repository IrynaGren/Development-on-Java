package lab1;

public class Main {

    public static void main(String[] args) {
        double S = 0.0;
        short a = 3;
        short b = -3;
        short denominator;
        short numerator;
        int n = 8;
        int m = -2;
        final int C = 0;

        if (a <= C && n >= C) {
            System.out.print("Error! Isn't divisible by 0.\n");
        } else {
            for (short i = a; i <= n; ++i) {
                denominator = (short)(i - C);
                for (short j = b; j <= m; ++j) {
                    numerator = (short)(i % j);
                    S += numerator / (double)denominator; // робимо змiнну дабл, щоб були точнi розрахунки
                }
            }
            System.out.println("S = " + S);
        }
    }
}
