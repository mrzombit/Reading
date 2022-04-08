package com.behavioral2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSortStrategy implements SortStrategy {
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

    @Override
    public void customSort(List<Person> people) {
        // print People from people[i].name
        ArrayList<String> names = new ArrayList<String>();
        for (Person member: people) {
            names.add(member.getName());
        }
        Collections.sort(names);
        ArrayList<Person> members = new ArrayList<>();
        for (int i = 0; i < names.size() ; i++) {
            for (int j = 0; j < people.size() ; j++){
                if( people.get(j).getName() == names.get(i)){
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
