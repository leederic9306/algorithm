package baekjoon.array._1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");

        int sum = 0;
        int max = 0;

        for(int i = 0 ; i < N; i++){
            int value = Integer.parseInt(scores[i]);
            sum += value;
            max = Math.max(value, max);
        }

        System.out.println(sum * 100.0 / max / N);

        br.close();
        bw.close();
    }
}
