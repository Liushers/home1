package ru.geekbrains.java_one.lesson_a.online_h1;

import java.io.CharArrayWriter;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
//task1
        int[] liu = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replace(liu);
        System.out.print("\n");

// task2
        int[] l = new int[8];
        fill(l);
        System.out.println(Arrays.toString(l));

//task3
        int[] z = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(z));
        Array(z);
        System.out.println(Arrays.toString(z));

// task4
        int[] s = {12, 32, 32, 532};
        Search1(s);
        Search2(s);
        System.out.println(Search1(s));
        System.out.println(Search2(s));

// task5
        int[][] Ann = new int[7][7];
        Square1(Ann);
        Square2(Ann);
    }

    //task1
    private static void replace(int[] liu) {
        for (int a = 0; a < liu.length; a++) {
            liu[a] = (liu[a] == 1) ? 0 : 1;
            System.out.print(liu[a] + " ");
        }
    }

    // task2
    public static void fill(int[] x) {
        for (int a = 0; a < x.length; a++) {
            x[a] = a * 3 + 1;
        }
    }

    // task3
    private static void Array(int[] y) {
        for (int b = 0; b < y.length; b++) {
            if (y[b] < 6) {
                y[b] *= 2;
            }
        }
    }

    // task4
    private static int Search1(int [] m) {
        int min = m[0];
        for (int l = 0; l < m.length; l++) {
            if (min > m[l])
                min = m[l];
        }
        return min;
    }

    private static int Search2(int[] n) {
        int max = n[0];
        for (int l = 0; l < n.length; l++) {
            if (max < n[l])
                max = n[l];
        }
        return max;
    }

    private static void Square1(int[][] k) {
        for(int x = 0; x < k.length; x++) {
            k[x][x] = 1;
            k[x][k.length - 1 - x] = 1;
        }
    }
    private static void Square2(int[][] k) {
        for(int x = 0; x < k.length; x++) {
            System.out.println(Arrays.toString(k[x]));
        }
        }
}