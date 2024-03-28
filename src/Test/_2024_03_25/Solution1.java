package Test._2024_03_25;

public class Solution1 {
    public int solution(int[] array) {
        int answer = 0;
        //정렬 후 배열크기/2
        int min = 0;
        for(int i=0; i<array.length-1;i++){
            min = array[i];
            for(int j=i+1;j< array.length;j++){
                if(min > array[j]){
                    min = array[j];
                    array[j]=array[i];
                    array[i] = min;
                }
            }
        }
        answer = array[array.length/2];
        return answer;
    }
}
