package com.tencent.maas.analytics;

public enum MJAnalyticsEventType {
    General(0),
    Error(1),
    Preproc(2),
    Export(3),
    Playback(4),
    Capture(5);
    
    private final int value;

    private MJAnalyticsEventType(int i) {
        this.value = i;
    }

    public static MJAnalyticsEventType fromInt(int i) {
        for (MJAnalyticsEventType mJAnalyticsEventType : values()) {
            if (mJAnalyticsEventType.getValue() == i) {
                return mJAnalyticsEventType;
            }
        }
        return General;
    }

    public int getValue() {
        return this.value;
    }
}
