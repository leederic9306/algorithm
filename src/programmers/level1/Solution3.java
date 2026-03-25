package programmers.level1;

import java.util.*;

//폰켓몬
class Solution3 {
    public int solution(int[] nums) {
        int maxSlots = nums.length / 2;

        HashSet<Integer> ponketmonTypes = new HashSet<>();
        for (int num : nums) {
            ponketmonTypes.add(num);
        }

        int typeCount = ponketmonTypes.size();
        return Math.min(maxSlots, typeCount);
    }
}
