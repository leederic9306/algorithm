package programmers.level1;

import java.util.HashMap;
import java.util.Map;

//완주하지 못한 선수
class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> person = new HashMap<>();

        for (String part : participant) {
            person.put(part, person.getOrDefault(part, 0) + 1);
        }

        for (String comp : completion) {
            person.put(comp, person.get(comp) - 1);
        }

        for (Map.Entry<String, Integer> entry : person.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}
