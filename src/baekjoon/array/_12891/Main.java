package baekjoon.array._12891;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int answer = 0;
    public static char[] dna = {'A', 'C', 'G', 'T'};
    public static int[] origin = new int[4];
    public static int[] check = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        char[] chars = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < p; i++) {
            add(chars[i]);
        }
        if(isValid()) answer++;

        for(int i = p; i < s; i++) {
            int left = i - p;

            add(chars[i]);
            remove(chars[left]);

            if(isValid()) answer++;
        }

        bw.write(answer + "\n");
        br.close();
        bw.close();
    }

    public static void add(char ch) {
        if(ch == 'A') check[0]++;
        else if(ch == 'C') check[1]++;
        else if(ch == 'G') check[2]++;
        else if (ch == 'T') check[3]++;
    }

    public static void remove(char ch) {
        if(ch == 'A') check[0]--;
        else if(ch == 'C') check[1]--;
        else if(ch == 'G') check[2]--;
        else if (ch == 'T') check[3]--;
    }

    public static boolean isValid() {
        for(int i = 0; i < 4; i++) {
            if (check[i] < origin[i]) return false;
        }
        return true;
    }
}
