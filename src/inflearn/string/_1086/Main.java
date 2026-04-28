package inflearn.string._1086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        solution(str, ch);
    }

    public static void solution(String str, char ch) {
        String lowerStr = str.toLowerCase();
        char lowerCh = Character.toLowerCase(ch);

        int count = 0;
        for(int i = 0; i < lowerStr.length(); i++) {
            if(lowerStr.charAt(i) == lowerCh) {
                count++;
            }
        }

        System.out.println(count);
    }
}