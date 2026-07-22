class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int i = included.length;
    /*  3 4 라 가정 ㄱㄱ
    3시작 8항 4 32
    4항만 됫다가정하면
    3 7 11 15        15뱉어야함 
    
    answer = 3+ 3*4  12 15 */
        for (int j =0;j<i;j++){
            
            if(included[j]){
                answer += a+j*d;
            }
        }
        return answer;
        
    }
}