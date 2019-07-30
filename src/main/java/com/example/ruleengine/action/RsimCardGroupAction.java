package com.example.ruleengine.action;

import com.example.ruleengine.domain.SimCardGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexouyang
 * @Date 2019-07-29
 */
public class RsimCardGroupAction {
    public static List<SimCardGroup> loadRsim(String country) {
        ArrayList<SimCardGroup> simCardList =  new ArrayList<>();
        if( "USA".equalsIgnoreCase(country) ){
            simCardList.add(MockCardGroup.group1);
            simCardList.add(MockCardGroup.group2);
            simCardList.add(MockCardGroup.group3);
            simCardList.add(MockCardGroup.group4);
            return simCardList;
        }else{
            return simCardList;
        }
    }
}
