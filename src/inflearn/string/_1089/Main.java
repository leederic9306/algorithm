package inflearn.string._1089;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strArr = new String[N];
        for(int i = 0; i < N; i++){
            strArr[i] = sc.next();
        }


        solution(strArr);
    }

    public static void solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            answer[i] = new StringBuilder(strArr[i]).reverse().toString();
        }

        for(String str : answer){
            System.out.println(str);
        }
    }
}
