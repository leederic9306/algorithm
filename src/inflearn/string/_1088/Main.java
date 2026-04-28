package inflearn.string._1088;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        solution(str);
    }

    public static void solution(String str) {
        String[] strArr = str.split(" ");

        String answer = "";
        int max = Integer.MIN_VALUE;
        for(String s : strArr) {
            if(s.length() > max) {
                max = s.length();
                answer = s;
            }
        }

        System.out.println(answer);
    }
}
