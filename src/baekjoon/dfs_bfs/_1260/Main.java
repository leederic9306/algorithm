package baekjoon.dfs_bfs._1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for(int i = 0; i <= N; i++){
            Collections.sort(graph.get(i));
        }

        dfs(new boolean[graph.size()], V);
        System.out.println();
        bfs(V);
    }

    public static void dfs(boolean[] visited, int index){
        visited[index] = true;
        System.out.print(index + " ");
        for(int next: graph.get(index)){
            if(!visited[next]){
                dfs(visited, next);
            }
        }
    }

    public static void bfs(int index){
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        visited[index] = true;

        while(!queue.isEmpty()){
            int cur = queue.poll();
            System.out.print(cur + " ");
            for(int next: graph.get(cur)){
                if(!visited[next]){
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

    }

}