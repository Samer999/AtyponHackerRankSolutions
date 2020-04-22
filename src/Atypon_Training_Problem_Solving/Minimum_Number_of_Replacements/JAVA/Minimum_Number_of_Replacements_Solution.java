package Atypon_Training_Problem_Solving.Minimum_Number_of_Replacements.JAVA;
import java.util.*;

public class Minimum_Number_of_Replacements_Solution {
    static Long n, q;
    static Scanner in = new Scanner(System.in);
    static HashMap<Long, Integer> dp = new HashMap<>();

    public static void main(String[] args) {
        q = in.nextLong();

        while(q-- != 0) {
            n = in.nextLong();
            System.out.println(solve(n));
        }

    }

    public static int solve(long n) {
        if (n == 1)
            return 0;
        if (dp.get(n) != null)
            return dp.get(n);

        int val;

        if (n % 2 == 0) {
            val = solve(n / 2) + 1;
            dp.put(n, val);
            return val;
        }


        val = Math.min(solve(n + 1) + 1, solve(n - 1) + 1);

        dp.put(n, val);

        return val;


    }


}