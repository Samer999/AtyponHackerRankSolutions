package Atypon_Training_Problem_Solving.Count_of_Unique_Integers.JAVA;
import java.util.*;

public class Count_of_Unique_Integers_Solution {
    static int n, q, d;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        n = in.nextInt();
        int[]ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = in.nextInt();

        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar[i]; j++) {
                q = in.nextInt();
                if (!set.contains(q))
                    map.put(q, 0);
                set.add(q);
                map.put(q, map.get(q) + 1);

            }
        }

        q = 0;

        for (int x : set) {
            if (map.get(x) == 1)
                q++;
        }

        System.out.println(q);
    }



}