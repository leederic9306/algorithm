package baekjoon.dfs_bfs._11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st2.nextToken()) - 1;
            int y = Integer.parseInt(st2.nextToken()) - 1;

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        System.out.println(solution(graph, new boolean[N]));

    }

    public static int solution(List<List<Integer>> graph, boolean[] visited) {
        int answer = 0;
        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
                answer++;
            }
        }


        return answer;
    }


    public static void dfs(List<List<Integer>> graph, boolean[] visited, int start) {
        visited[start] = true;
        for(int neighbor : graph.get(start)) {
            if(!visited[neighbor]) {
                dfs(graph, visited, neighbor);
            }
        }
    }
}
