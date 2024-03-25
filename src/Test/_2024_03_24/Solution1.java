package Test._2024_03_24;

class Solution1 {
    //기초 3-5
    public int solution(int a, int b) {
        String a1 = a+""+b+"";
        int as = Integer.parseInt(a1);
        int ms = a*b*2;
        int answer = 0;

        if(as>ms) {
            answer = as;
        }
        else answer = ms;

        return answer;
    }
}