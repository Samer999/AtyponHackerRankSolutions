package Atypon_Training_Problem_Solving.Count_of_Missing_Numbers.JAVA;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count_of_Missing_Numbers_Solution {

    public static void main(String[] args) {
        int n, ans = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ar.add(input.nextInt());

        Collections.sort(ar);

        for (int i = 1; i < n; i++) {
            ans += ar.get(i) - ar.get(i - 1) - 1;
        }


        System.out.println(ans);


    }
}
