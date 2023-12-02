package lab2;

import java.util.Scanner;

/**
 * C5 = 2, C=A+B;
 * C7 = 1, byte;
 * C11 = 7, Обчислити суму найбільших елементів в
 * стовпцях матриці з непарними номерами та найменших
 * елементів в стовпцях матриці з парними номерами
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int n = scan.nextInt();
        byte[][] a = new byte[n][n]; //матрица А
        byte[][] b = new byte[n][n]; //матрица B
        byte[][] c = new byte[n][n]; //матрица C
        //определяем матрицу А и выводим её
        System.out.println("Matrix A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (byte) Math.round(Math.random() * 10);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        //определяем матрицу B и выводим её
        System.out.println("Matrix B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = (byte) Math.round(Math.random() * 10);
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        //определяем матрицу C и выводим её
        System.out.println("Matrix C: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = (byte) (a[i][j] + b[i][j]);
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
        // сума max елементов в непарных столбцах
        int sum1 = 0;
        for (int j = 0; j < n; j += 2) {
            int max = c[0][j];
            for (int i = 1; i < n; i++) {
                if (c[i][j] > max) max = c[i][j];
            }
            sum1 += max;
        }
        // сума мin елементов в парных столбцах
        int sum2 = 0;
        for (int j = 1; j < n; j += 2) {
            int min = c[0][j];
            for (int i = 1; i < n; i++) {
                if (c[i][j] < min) min = c[i][j];
            }
            sum2 += min;
        }
        //сумируем суммы
        int sum = sum1 + sum2;
        System.out.println("\nSum: " + sum);
    }
}
