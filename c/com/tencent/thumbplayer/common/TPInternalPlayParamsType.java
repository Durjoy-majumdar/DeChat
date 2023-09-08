package com.tencent.thumbplayer.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TPInternalPlayParamsType {
    public static final int TP_INTERNAL_TYPE_DYNAMIC_STATISTIC_PARAMS = 2;
    public static final int TP_INTERNAL_TYPE_GENERAL_PLAY_FLOW_PARAMS = 1;
    public static final int TP_INTERNAL_TYPE_UNKNOWN = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InternalParamsType {
    }
}
