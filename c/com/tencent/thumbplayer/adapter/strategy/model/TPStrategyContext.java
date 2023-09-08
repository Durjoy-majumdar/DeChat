package com.tencent.thumbplayer.adapter.strategy.model;

public class TPStrategyContext {
    private String definition;
    private int errorCode;
    private int errorType;
    public int lastPlayerType;

    public TPStrategyContext(int i, int i2, int i3, String str) {
        this.errorCode = i3;
        this.errorType = i2;
        this.lastPlayerType = i;
        this.definition = str;
    }

    public String getDefinition() {
        return this.definition;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getErrorType() {
        return this.errorType;
    }

    public int getPlayerType() {
        return this.lastPlayerType;
    }
}
