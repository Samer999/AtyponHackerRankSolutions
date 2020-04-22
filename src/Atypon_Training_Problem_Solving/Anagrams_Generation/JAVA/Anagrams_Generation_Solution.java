package Atypon_Training_Problem_Solving.Anagrams_Generation.JAVA;
import javafx.util.Pair;

import java.io.*;
import java.util.*;



public class Anagrams_Generation_Solution {
    static int n, q, d;
    static MyScanner in = new MyScanner();//fast scan
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));//fast output

    static StringBuilder str = new StringBuilder("");

    public static void main(String[] args) throws IOException {

        n = in.nextInt();
        char[]ar = new char[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.next().charAt(0);
        }

        Arrays.sort(ar);

        rec(ar, 0);
        out.close();
    }


    static void rec(char[]ar, int ind) {
        if (ind == n) {
            out.println(str);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (ar[i] != '0') {
                str.append(ar[i]);
                ar[i] = '0';
                rec(ar, ind + 1);
                ar[i] = str.charAt(str.length() - 1);
                str.deleteCharAt(str.length() - 1);
            }
        }
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