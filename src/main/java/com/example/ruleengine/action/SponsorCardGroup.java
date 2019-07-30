package com.example.ruleengine.action;

import com.example.ruleengine.domain.SimCardGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexouyang
 * @Date 2019-07-29
 */
public class SponsorCardGroup {
    /**
     * 取美国的Sponsor的卡，优先使用app免费流量
     * @param country
     * @param appName
     * @return
     */
    public static List<SimCardGroup> loadSponsorSimCards(String country, String appName ){
        ArrayList<SimCardGroup> simCardList =  new ArrayList<>();
        if( !"USA".equalsIgnoreCase(country) ){
            return simCardList;
        }
        //简化了app免流量的判断逻辑，假定只要传递非NULL过来就符合要求
        if( appName == null  ){
            return simCardList;
        }
        //这个套餐很贵，但是它是赞助商。App免流量
        simCardList.add(MockCardGroup.group6);
        return simCardList;
    }
}
