package Atypon_Training_Problem_Solving.Large_Numbers_Modulus.JAVA;
import javafx.util.Pair;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Large_Numbers_Modulus_Solution {
    static int n, q, d;
    static MyScanner in = new MyScanner();//fast scan
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));//fast output
    public static void main(String[] args) throws IOException {

        n = in.nextInt();
        String s;
        int MOD = 1000000007;
        while(n-- != 0) {
            s = in.next();
            long sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum = ((s.charAt(i) - '0') + sum * 10) % MOD;
            }

            out.println(sum);
        }



        out.close();
    }


    public static class Student{

    }



    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}