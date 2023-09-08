package com.tencent.maas.instamovie.base;

public enum MJLogLevel {
    ISSUE(0),
    FATAL(1),
    ERROR(2),
    WARN(3),
    INFO(4),
    DEBUG(5);
    
    private final int value;

    private MJLogLevel(int i) {
        this.value = i;
    }

    public static MJLogLevel fromInt(int i) {
        for (MJLogLevel mJLogLevel : values()) {
            if (mJLogLevel.getValue() == i) {
                return mJLogLevel;
            }
        }
        return DEBUG;
    }

    public int getValue() {
        return this.value;
    }
}
