package baekjoon.array._11003;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty() && deque.getLast()[1] > now) {
                deque.removeLast();
            }

            deque.addLast(new int[]{i, now});

            if (deque.getFirst()[0] <= i - L) {
                deque.removeFirst();
            }

            bw.write(deque.getFirst()[1] + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}


//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int L = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(br.readLine());
//
//        int[] qValue = new int[N];
//        int[] qIndex = new int[N];
//
//        int head = 0;
//        int tail = 0;
//
//        for (int i = 0; i < N; i++) {
//            int now = Integer.parseInt(st.nextToken());
//            while (head < tail && qValue[tail - 1] > now) {
//                tail--;
//            }
//
//            qValue[tail] = now;
//            qIndex[tail] = i;
//            tail++;
//
//            if (qIndex[head] <= i - L) {
//                head++;
//            }
//
//            bw.write(qValue[head] + " ");
//        }
//
//        bw.flush();
//        br.close();
//        bw.close();
//    }
//}
