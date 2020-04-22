package Atypon_Training_Problem_Solving.Alis_Homework_II.JAVA;

import java.util.*;

public class Alis_Homework_II_Solution {
    static long a, b, c;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        a = in.nextLong();
        b = in.nextLong();
        c = in.nextLong();


        ArrayList<Long> div = new ArrayList<>();
        ArrayList<Solu> maybe = new ArrayList<>();
        HashSet <Long> available = new HashSet<>();

        for (long i = 1; i * i <= b; i++) {
            if (b % i == 0) {
                div.add(i);
                div.add(-i);
                if (i != b / i) {
                    div.add(b / i);
                    div.add(-b / i);
                }
                available.add(i);
                available.add(b / i);
                available.add(-i);
                available.add(-b / i);
            }
        }

        Collections.sort(div);

        for (int i = 0; i < div.size(); i++)
            for (int j = i + 1; j < div.size(); j++) {
                long x, y;
                x = div.get(i);
                y = div.get(j);
                long left = a - x - y;
                if (available.contains(left) && x * x + y * y + left * left == c && x * y * left == b && x + y + left == a) {
                    System.out.println(Math.min(Math.min(x, y), left) + " " + (x + y + left - Math.min(Math.min(x, y), left) - Math.max(Math.max(x, y), left)) + " " + Math.max(Math.max(x, y), left));
                    return;
                }
            }


        if (b == 0) {
            for (int i = (int)a - 10000; i < a; i++) {
                long aa, cc;
                aa = i;
                cc = a - i;
                if (aa * aa + cc * cc == c && aa != cc && cc != 0) {
                    System.out.println(Math.min(0, Math.min(aa, cc)) + " " + (aa + cc -  Math.min(0, Math.min(aa, cc)) - Math.max(0, Math.max(aa, cc))) + " " + Math.max(0, Math.max(aa, cc)));
                    return;
                }
            }
        }




        System.out.println("no solution");

    }



}

class Solu{
    public long a, b, c;
    public Solu(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
