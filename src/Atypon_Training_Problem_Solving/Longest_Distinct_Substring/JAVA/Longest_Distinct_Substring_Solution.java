package Atypon_Training_Problem_Solving.Longest_Distinct_Substring.JAVA;
import java.util.*;

public class Longest_Distinct_Substring_Solution {
    static int n, q, d;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        q = in.nextInt();
        String s;
        while(q-- != 0) {
            s = in.next();
            int[]frq = new int[300];
            int l = 0, max = 1;
            frq[s.charAt(0)]++;
            for (int i = 1; i < s.length(); i++) {
                frq[s.charAt(i)]++;
                while(frq[s.charAt(i)] > 1)
                    frq[s.charAt(l++)]--;
                max = Math.max(max, i - l + 1);
            }

            System.out.println(max);
        }


    }




}