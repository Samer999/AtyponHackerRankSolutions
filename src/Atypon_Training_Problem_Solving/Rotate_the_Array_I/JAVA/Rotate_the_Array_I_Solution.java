package Atypon_Training_Problem_Solving.Rotate_the_Array_I.JAVA;

import java.util.Scanner;

public class Rotate_the_Array_I_Solution {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n, k;
        n = in.nextInt();
        k = in.nextInt();
        int []ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[(i + k) % n] = in.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");


    }
}
