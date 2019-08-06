package com.example.ruleengine.control;

/**
 * @author alexouyang
 * @Date 2019-08-06
 */
public class ControlConstants {
    private boolean applyIfEnabled;

    private boolean changeStrategyEnabled;

    public boolean isApplyIfEnabled() {
        return applyIfEnabled;
    }

    public void setApplyIfEnabled(boolean applyIfEnabled) {
        this.applyIfEnabled = applyIfEnabled;
    }

    public boolean isChangeStrategyEnabled() {
        return changeStrategyEnabled;
    }

    public void setChangeStrategyEnabled(boolean changeStrategyEnabled) {
        this.changeStrategyEnabled = changeStrategyEnabled;
    }
}
