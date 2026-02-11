package baekjoon.dfs_bfs._2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int answer = -1;
    static int start, end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        visited = new boolean[N + 1];

        dfs(start, 0);
        System.out.println(answer);
    }

    public static void dfs(int index, int depth) {
        visited[index] = true;
        if(index == end){
            answer = depth;
        }

        for(int i : graph.get(index)){
            if(!visited[i]){
                dfs(i, depth + 1);
            }
        }
    }

}
