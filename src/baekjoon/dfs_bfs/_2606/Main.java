package baekjoon.dfs_bfs._2606;

import java.util.*;
import java.io.*;

class Main {
    static int answer;

    public static void dfs(List<List<Integer>> graph, boolean[] visited, int index){
        visited[index] = true;
        for(int i : graph.get(index)){
            if(!visited[i]){
                dfs(graph, visited, i);
            }
        }
        answer++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(i, new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(graph, new boolean[N], 0);
        System.out.println(answer - 1);

        br.close();
    }
}
