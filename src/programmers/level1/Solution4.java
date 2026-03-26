package programmers.level1;

import java.util.*;

public class Solution4 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int lastNum = -1;

        for (int num : arr) {
            if (num != lastNum) {
                list.add(num);
                lastNum = num;
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
