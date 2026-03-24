package programmers.level1;

import java.util.HashMap;
import java.util.Map;

//완주하지 못한 선수
class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> person = new HashMap<>();

        // 1. 참가자 등록: getOrDefault로 if문 없이 깔끔하게 카운팅
        for (String part : participant) {
            person.put(part, person.getOrDefault(part, 0) + 1);
        }

        // 2. 완주자 차감
        for (String comp : completion) {
            person.put(comp, person.get(comp) - 1);
        }

        // 3. 완주하지 못한 사람 찾기: entrySet()으로 탐색 비용 최소화
        for (Map.Entry<String, Integer> entry : person.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break; // 정답을 찾았으므로 즉시 반복문 종료 (효율성 UP)
            }
        }

        return answer;
    }
}
