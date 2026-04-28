package inflearn.string._1090;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    public static void solution(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();

        while(left < right) {
            if(Character.isAlphabetic(chars[left]) && Character.isAlphabetic(chars[right])){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }else if(Character.isAlphabetic(chars[left])){
                right--;
            }else{
                left++;
            }
        }

        System.out.println(String.valueOf(chars));
    }
}
