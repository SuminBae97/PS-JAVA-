package com.company;

public class ProgrammersMax {
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        int max_index= 0;
        int max_value = 0;

        for(int i =0; i<array.length; i++){
            int value = array[i];
            if(value>max_value){
                max_value = value;
                max_index = i;

            }
        }
        answer[0] = max_value;
        answer[1] = max_index;



        return answer;
    }
}
