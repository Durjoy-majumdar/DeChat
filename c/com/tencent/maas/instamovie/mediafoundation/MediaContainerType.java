package com.tencent.maas.instamovie.mediafoundation;

import java.util.HashMap;
import java.util.Map;

public enum MediaContainerType {
    MP4(0),
    MOV(1),
    MP3(2),
    M4A(3);
    
    private static final Map<Integer, MediaContainerType> intToTypeMap = null;
    private int type;

    /* access modifiers changed from: public */
    static {
        int i;
        intToTypeMap = new HashMap();
        for (MediaContainerType mediaContainerType : values()) {
            intToTypeMap.put(Integer.valueOf(mediaContainerType.type), mediaContainerType);
        }
    }

    private MediaContainerType(int i) {
        this.type = i;
    }

    public static MediaContainerType fromInt(int i) {
        MediaContainerType mediaContainerType = intToTypeMap.get(Integer.valueOf(i));
        if (mediaContainerType == null) {
            return null;
        }
        return mediaContainerType;
    }

    public int getType() {
        return this.type;
    }
}
