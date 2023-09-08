package com.tencent.tav.core;

import com.tencent.tav.coremedia.CMTime;

public class CMTimeUtils {
    public static long CMTimeConvertToUs(CMTime cMTime) {
        return (long) (cMTime.getTimeSeconds() * 1000.0f * 1000.0f);
    }
}
