package inflearn.string._1087;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        solution(str);
    }

    public static void solution(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char ch : chars){
            if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(sb.toString());
    }
}
