package com.tencent.thumbplayer.utils;

import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import java.io.File;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

public class TPUrlAnalyzer {
    public static final int TP_URL_PROTOCOL_TYPE_FILE = 4;
    public static final int TP_URL_PROTOCOL_TYPE_HTTP = 0;
    public static final int TP_URL_PROTOCOL_TYPE_HTTPS = 1;
    public static final int TP_URL_PROTOCOL_TYPE_RESOURCELOADER = 5;
    public static final int TP_URL_PROTOCOL_TYPE_RTMP = 2;
    public static final int TP_URL_PROTOCOL_TYPE_UNKNOWN = -1;
    public static final int TP_URL_PROTOCOL_TYPE_WEBRTC = 3;
    private static Map<String, Integer> mPrefixToTypeMap;

    @Target({ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TPUrlType {
    }

    static {
        HashMap hashMap = new HashMap();
        mPrefixToTypeMap = hashMap;
        hashMap.put(HttpWrapperBase.PROTOCAL_HTTP, 0);
        mPrefixToTypeMap.put(HttpWrapperBase.PROTOCAL_HTTPS, 1);
        mPrefixToTypeMap.put("rtmp://", 2);
        mPrefixToTypeMap.put("webrtc://", 3);
        mPrefixToTypeMap.put("file://", 4);
        mPrefixToTypeMap.put("/", 4);
    }

    public static int getUrlProtocolType(String str) {
        if (str == null) {
            return -1;
        }
        String lowerCase = str.toLowerCase();
        for (Map.Entry next : mPrefixToTypeMap.entrySet()) {
            if (lowerCase.startsWith((String) next.getKey())) {
                return ((Integer) next.getValue()).intValue();
            }
        }
        try {
            return new File(str).exists() ? 4 : -1;
        } catch (Exception unused) {
        }
    }
}
