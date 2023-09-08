package com.tencent.maas.instamovie.mediafoundation;

import java.util.HashMap;
import java.util.Map;

public enum VideoCodecId {
    H263(0),
    H264(1),
    HEVC(2),
    MPEG4(3),
    MPEG2(4),
    MPEG1(5),
    MJPEG(6);
    
    private static final Map<Integer, VideoCodecId> intToTypeMap = null;

    /* renamed from: id */
    private int f264613id;

    /* access modifiers changed from: public */
    static {
        int i;
        intToTypeMap = new HashMap();
        for (VideoCodecId videoCodecId : values()) {
            intToTypeMap.put(Integer.valueOf(videoCodecId.f264613id), videoCodecId);
        }
    }

    private VideoCodecId(int i) {
        this.f264613id = i;
    }

    public static VideoCodecId fromInt(int i) {
        VideoCodecId videoCodecId = intToTypeMap.get(Integer.valueOf(i));
        if (videoCodecId == null) {
            return null;
        }
        return videoCodecId;
    }

    public int getId() {
        return this.f264613id;
    }
}
