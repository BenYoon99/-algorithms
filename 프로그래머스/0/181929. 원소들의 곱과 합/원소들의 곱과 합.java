class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        int mul = 1;
        
        for (int i =0;i<num_list.length;i++){
            
            sum += num_list[i];
            
        }
        
        for (int j=0;j<num_list.length;j++){
            
            mul *= num_list[j];
            
        }
        
        if ((sum*sum)>mul){
            
            answer = 1;
        }
        else {
            answer = 0;
        }
        
        
        
        
        return answer;
    }
}