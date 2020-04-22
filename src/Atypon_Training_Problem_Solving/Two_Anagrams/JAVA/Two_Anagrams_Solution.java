package Atypon_Training_Problem_Solving.Two_Anagrams.JAVA;
import java.util.*;


public class Two_Anagrams_Solution {
    static long a, b, c;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] first = new int[250];
        int[] second = new int[250];
        String a, b;
        a = in.nextLine();
        b = in.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ' || a.charAt(i) == '\t')
                continue;
            first[a.charAt(i)]++;
        }

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == ' ' || b.charAt(i) == '\t')
                continue;
            second[b.charAt(i)]++;
        }

        boolean f = true;

        for (int i = 0; i < 250; i++)
            if (first[i] != second[i])
                f = false;

        if (f)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}