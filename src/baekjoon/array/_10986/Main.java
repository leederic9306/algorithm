package baekjoon.array._10986;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] s = new long[N];
        long[] c = new long[M];

        s[0] = Long.parseLong(st.nextToken());
        for(int i = 1; i < N; i++){
            s[i] = s[i - 1] + Long.parseLong(st.nextToken());
        }

        long count = 0;
        for(int i = 0; i < N; i++){
            int reminder = (int)(s[i] % M);
            if(reminder == 0) count++;
            c[reminder]++;
        }

        for(int i = 0; i < M; i++){
            if(c[i] > 1){
                count += (c[i] * (c[i] - 1)) / 2;
            }
        }


        bw.write(count+"");

        br.close();
        bw.close();
    }
}
