class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 첫 번째 숫자를 선택 (i)
        for (int i = 0; i < nums.length; i++) {
            // 두 번째 숫자를 선택 (j는 i 다음부터 확인)
            for (int j = i + 1; j < nums.length; j++) {
                // 두 숫자의 합이 target이랑 같은지 확인
                if (nums[i] + nums[j] == target) {
                    // 맞다면 두 숫자의 번호(인덱스)를 배열에 담아 반환
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // 답이 없을 경우 (문제 조건상 일어날 일 없음)
    }
}