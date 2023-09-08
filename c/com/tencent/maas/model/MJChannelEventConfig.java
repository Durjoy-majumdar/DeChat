package com.tencent.maas.model;

public class MJChannelEventConfig {
    private final String eventName;
    private final String finderNickName;

    public MJChannelEventConfig(String str, String str2) {
        this.eventName = str;
        this.finderNickName = str2;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getFinderNickName() {
        return this.finderNickName;
    }
}
