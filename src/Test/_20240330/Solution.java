package Test._20240330;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] b = new int[array.length];
        if(array.length==1){
            answer = array[0];
        }
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            b[i] = count;
        }
    for(int i=0;i<b.length;i++){
        for(int j=i+1;j<b.length;j++){
            if(b[i]==b[j]){
                answer=-1;
            } else if (b[i]<b[j]) {
                answer = b[j];
            }
            else answer = b[i];

        }
    }
    return answer;
    }
}