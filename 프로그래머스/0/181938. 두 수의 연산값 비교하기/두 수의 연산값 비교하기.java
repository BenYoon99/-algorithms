class Solution {
    public int solution(int a, int b) {
        
        // ex a=2 b =91
        
        int answer = 0;
        
        /*a가 1의자리 10의자리 100의자리 1000의자리 10000의자리 200 91 3 17
        300 17  900 84*/
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        String preAnswer = (strA+strB);
        
        int plusAnswer = Integer.parseInt(preAnswer);
            
        int multipliedAnswer = 2 * a * b ;
        
        if (multipliedAnswer > plusAnswer){
            
            answer = multipliedAnswer;
        }
        else{
            answer = plusAnswer;
        }
        
        return answer;
    }
}