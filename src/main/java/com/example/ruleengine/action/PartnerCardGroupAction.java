package com.example.ruleengine.action;

import com.example.ruleengine.domain.SimCardGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexouyang
 * @Date 2019-07-29
 */
public class PartnerCardGroupAction {
    /**
     * 取美国某个区域的合作商的卡，可以拿到优惠价格
     * @param country
     * @return
     */
    public static List<SimCardGroup> loadPartnerVsim(String country  ) {
        ArrayList<SimCardGroup> simCardList =  new ArrayList<>();
        if( "USA".equalsIgnoreCase(country) ){
            simCardList.add(MockCardGroup.group7);
            return simCardList;
        }else{
            return simCardList;
        }
    }
}
