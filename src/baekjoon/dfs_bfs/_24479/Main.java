package baekjoon.dfs_bfs._24479;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int seq = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for(int i = 0; i < N  + 1; i++) {
            Collections.sort(graph.get(i));
        }

        int[] visited = new int[N + 1];
        dfs(graph, visited, R);

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static void dfs(List<List<Integer>> graph, int[] visited, int pos) {
        visited[pos] = seq;
        seq++;
        for(int i : graph.get(pos)) {
            if(visited[i] == 0) {
                dfs(graph, visited, i);
            }
        }
    }
}

