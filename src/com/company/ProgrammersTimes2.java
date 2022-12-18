package com.company;

public class ProgrammersTimes2 {
    public int[] solution(int[] numbers) {
        int v = numbers.length;

        int [] answer = new int[v];
        for(int i=0; i<v; i++){
            answer[i] = numbers[i]*2;

        }

        return answer;
    }
}
