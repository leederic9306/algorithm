package baekjoon.array._2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int start = 1;
        int end = 1;

        int count = 1;
        int sum = 1;
        while(end != N){
            if(sum == N){
                count++;
                end++;
                sum += end;
            }else if(sum < N){
                end++;
                sum += end;
            }else{
                sum -= start;
                start++;
            }
        }

        bw.write(count+"");

        br.close();
        bw.close();
    }
}
