package programmers.level1;

//문자열 내 p와 y의 개수
public class Solution1 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String str = "Pyy";

        System.out.println(sol.solution(str));
    }

    boolean solution(String s) {
        char[] arr = s.toCharArray();
        int pCnt = 0;
        int yCnt = 0;

        for(char ch: arr){
            if(ch == 'p' || ch == 'P'){
                pCnt++;
            }else if(ch == 'y' || ch == 'Y'){
                yCnt++;
            }
        }

        return pCnt == yCnt;
    }
}
