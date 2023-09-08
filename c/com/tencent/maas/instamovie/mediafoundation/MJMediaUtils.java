package com.tencent.maas.instamovie.mediafoundation;

public class MJMediaUtils {
    public static boolean isSupportedEncodingVideoCodecID(VideoCodecId videoCodecId) {
        return nativeIsSupportedEncodingVideoCodecID(videoCodecId.getId());
    }

    private static native boolean nativeIsSupportedEncodingVideoCodecID(int i);
}
