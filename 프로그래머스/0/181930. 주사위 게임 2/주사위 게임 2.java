class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        /*
        경우의수가 a = b =c 
        a=b c
        
        b=c a
        
        c=a b
        
        
        */
        if (a==b){
            if(b==c){
                answer = (a+b+c)*((a*a)+(b*b)+(c*c))*((a*a*a)+(b*b*b)+(c*c*c));
            }
            else if (b!=c){
                if(c!=a){
                answer = (a+b+c)*((a*a)+(b*b)+(c*c));
                }
        }
        }
        
        if (a!=b){
            if(b==c){
                answer = (a+b+c)*((a*a)+(b*b)+(c*c));
            }
            if(a==c){
                answer = (a+b+c)*((a*a)+(b*b)+(c*c));
            }
            if(b!=c){
                if(c!=a){
                answer = a+b+c;
                }
            }
        }        
        
        
        
        
        return answer;
    }
}