package com.behavioral2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeightSortStrategy implements SortStrategy {
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

    @Override
    public void customSort(List<Person> people) {
        // print People from people[i].height
        ArrayList<Integer> heights = new ArrayList<Integer>();
        for (Person member: people) {
            heights.add(member.getHeight());
        }
        Collections.sort(heights);
        ArrayList<Person> members = new ArrayList<>();
        for (int i = 0; i < heights.size() ; i++) {
            for (int j = 0; j < people.size() ; j++){
                if( people.get(j).getHeight() == heights.get(i)){
                    members.add(people.get(j));
                    people.remove(j);
                }
            }
        }
        for (Person member: members){
            people.add(member);
        }
    }

}
