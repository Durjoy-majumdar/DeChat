package com.tencent.thumbplayer.tplayer.reportv2;

import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPReporterFactory {
    private static final String TAG = "TPReporterFactory";

    public static ITPReporter createReporterWithType(int i) {
        if (i == 0) {
            return new TPVodReporter();
        }
        if (i == 1) {
            return new TPLiveReporter();
        }
        if (i == 2) {
            return new TPPrepareFailReporter();
        }
        TPLogUtil.m21894e(TAG, "Type is not match ReporterType, return null");
        return null;
    }
}
