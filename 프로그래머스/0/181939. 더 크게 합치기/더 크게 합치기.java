class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        String strFirst = strA+strB;
        String strSecond = strB+strA;
        
        int firstAnswer = Integer.parseInt(strFirst);
        int secondAnswer = Integer.parseInt(strSecond);
        int sumAnswer = firstAnswer + secondAnswer;
        
        if (firstAnswer>secondAnswer){
            answer = firstAnswer;
        }
        else if (secondAnswer>firstAnswer){
            answer = secondAnswer;
        }
        else {
            answer = firstAnswer;
        }
        
        
        
        
        
        
        return answer;
    }
}