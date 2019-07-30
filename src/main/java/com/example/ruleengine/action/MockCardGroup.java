package com.example.ruleengine.action;

import com.example.ruleengine.domain.SimCardGroup;
import lombok.Data;

/**
 * Mock公司的卡组
 * @author alexouyang
 * @Date 2019-07-29
 */
public class MockCardGroup {
    public static SimCardGroup group1 = new SimCardGroup(1001,false,0,"TaTa",29.0f);
    public static SimCardGroup group2 = new SimCardGroup(1002,true,0,"TaTa",29.0f); //假定是一个繁忙的rsim卡组
    public static SimCardGroup group3 = new SimCardGroup(1003,false,0,"TaTa",39.0f);
    public static SimCardGroup group4 = new SimCardGroup(1004,false,0,"TaTa",39.0f);
    public static SimCardGroup group5 = new SimCardGroup(5,true,1,"AT&T",2.0f);//假定是一个繁忙的vsim卡组
    public static SimCardGroup group6 = new SimCardGroup(6,false,1,"AT&T",900.0f);
    public static SimCardGroup group7 = new SimCardGroup(7,false,1,"partner",3.0f);//假定是公司的partner
    public static SimCardGroup group8 = new SimCardGroup(8,false,1,"ddddd",4.0f);
}
