package com.tencent.mars.cdn;

import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import di3.C86312j;

public class CdnC2Java {
    private static final String TAG = "mars.CdnC2Java";

    public static String calcVideoRangeTs(String str, double d) {
        return ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).calcVideoRangeTs(str, d);
    }
}
