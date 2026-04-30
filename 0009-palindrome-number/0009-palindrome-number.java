class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        /* 숫자 같은게 뭐있지 313 414 515 101로 가보자 10000 0 121 1 
        101 101 101 1  1 121  1 12  2 10 2 12 121 12 1  1%10 1  120 + 1 121 1/10 0 
        */
        int original=x; // 121 
        int reversed=0; //0 
        while(x>0){
            int lastDigit= x%10;
            
            reversed = (reversed*10)+ lastDigit;

            x=x/10;
        }
        return original==reversed;
    }
}