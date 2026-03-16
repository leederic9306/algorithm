package baekjoon.array._2562;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxValue = Integer.MIN_VALUE;
        int index = 0;
        int N = 9;
        for(int i  = 0; i < N; i++){
            int value =  Integer.parseInt(br.readLine());
            if(value > maxValue){
                maxValue = value;
                index = i + 1;
            }
        }

        bw.write(maxValue + "\n");
        bw.write(index + "\n");

        br.close();
        bw.close();
    }
}
