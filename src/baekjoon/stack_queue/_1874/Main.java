package baekjoon.stack_queue._1874;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;
        boolean result = true;

        for (int i = 0; i < N; i++) {
            int target = arr[i];
            if (target >= num) {
                while (target >= num) {
                    stack.push(num++);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            }
            else {
                int top = stack.pop();

                if (top > target) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-").append("\n");
                }
            }
        }

        if (result) {
            System.out.print(sb.toString());
        }

        br.close();
    }
}
