package com.behavioral2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightStrategy implements SortStrategy {
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

    @Override
    public void customSort(List<Person> people) {
        // print People from people[i].weight
        ArrayList<Integer> weights = new ArrayList<Integer>();
        for (Person member: people) {
            weights.add(member.getWeight());
        }
        Collections.sort(weights);
        ArrayList<Person> members = new ArrayList<>();
        for (int i = 0; i < weights.size() ; i++) {
            for (int j = 0; j < people.size() ; j++){
                if( people.get(j).getWeight() == weights.get(i)){
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
