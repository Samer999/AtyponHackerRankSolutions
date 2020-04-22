package Atypon_Training_Problem_Solving._3SUM.JAVA;
import java.io.*;
import java.util.*;

public class _3SUM_Solution {
    static int n, q, d;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        n = in.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x, i = 0; i < n; i++) {
            x = in.nextInt();
            ar.add(x);
            if (map.get(x) == null)
                map.put(x, 1);
            else
                map.put(x, map.get(x) + 1);
        }

        long ans = 0;

        for (int x, y, z, i = 0; i < n; i++) {
            x = ar.get(i);
            map.put(x, map.get(x) - 1);
            for (int j = i + 1; j < n; j++) {
                y = ar.get(j);
                map.put(y, map.get(y) - 1);
                if (map.get(-x-y) != null)
                    ans += map.get(-x-y);
            }

            for (int j = i + 1; j < n; j++)
                map.put(ar.get(j), map.get(ar.get(j)) + 1);
        }


        System.out.println(ans);

    }

}