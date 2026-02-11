package baekjoon.dfs_bfs._11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] parent;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i <= N; i++){
            graph.add(i, new ArrayList<>());
        }

        for(int i = 0; i < N - 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        parent = new int[N + 1];
        visited = new boolean[N + 1];

        dfs(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
        br.close();
    }

    public static void dfs(int index){
        visited[index] = true;
        for(int i: graph.get(index)){
            if(!visited[i]){
                parent[i] = index;
                dfs(i);
            }
        }
    }

}
