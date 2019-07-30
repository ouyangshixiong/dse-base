package com.example.ruleengine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author alexouyang
 * @Date 2019-07-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SimCardGroup implements Serializable,Comparable<SimCardGroup> {

    //卡组号
    private Integer groupId;
    //卡组余量
    private Boolean isBusy;
    //0为rsim，1为vsim
    private Integer type;
    //运营商
    private String carrier;
    //价格
    private float price;

    @Override
    public int compareTo(SimCardGroup other) {
        return other.groupId.equals(groupId)  ? 0 : 1;
    }
}
