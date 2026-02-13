package baekjoon.array._111720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        int sum = 0;
        int N = Integer.parseInt(br.readLine());

        String numbers = br.readLine();
        char[] arr = numbers.toCharArray();

        for(int i = 0; i < N ; i++){
            sum += Integer.parseInt(String.valueOf(arr[i]));
        }

        System.out.println(sum);

        br.close();
        bw.close();
    }
}
