package com.example.ruleengine.action;

import com.example.ruleengine.domain.SimCardGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexouyang
 * @Date 2019-07-29
 */
public class VsimCardGroupAction {

    /**
     * 取美国本地卡
     * @param country
     * @return
     */
    public static List<SimCardGroup> loadLocalVsim(String country  ) {
        ArrayList<SimCardGroup> simCardList =  new ArrayList<>();
        if( "USA".equalsIgnoreCase(country) ){
            simCardList.add(MockCardGroup.group6);
            simCardList.add(MockCardGroup.group7);
            simCardList.add(MockCardGroup.group8);
            return simCardList;
        }else{
            return simCardList;
        }
    }

    /**
     * VIP取美国本地卡
     * @param country
     * @return
     */
    public static List<SimCardGroup> loadLocalVsim(String country, Boolean isVip  ) {
        ArrayList<SimCardGroup> simCardList =  new ArrayList<>();
        if( "USA".equalsIgnoreCase(country) ){
            simCardList.add(MockCardGroup.group5);
            simCardList.add(MockCardGroup.group6);
            simCardList.add(MockCardGroup.group7);
            simCardList.add(MockCardGroup.group8);
            return simCardList;
        }else{
            return simCardList;
        }
    }
}
