package com.tencent.tavkit.utils;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class BenchUtil {
    public static boolean ENABLE_DEBUG = false;
    private static final String TAG = "BenchUtil";
    private static Map<String, Long> endTimeMap = new HashMap();
    private static Map<String, Long> startTimeMap = new HashMap();

    public static long benchEnd(String str) {
        Map<String, Long> map;
        Long l;
        if (!ENABLE_DEBUG || TextUtils.isEmpty(str) || (map = startTimeMap) == null || (l = map.get(str)) == null) {
            return 0;
        }
        return System.currentTimeMillis() - l.longValue();
    }

    public static void benchStart(String str) {
        if (ENABLE_DEBUG && !TextUtils.isEmpty(str)) {
            startTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void clear() {
        startTimeMap.clear();
        endTimeMap.clear();
    }

    public static void setEnableDebugLog(boolean z) {
        ENABLE_DEBUG = z;
    }
}
