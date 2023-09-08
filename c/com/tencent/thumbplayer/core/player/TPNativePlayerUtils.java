package com.tencent.thumbplayer.core.player;

import android.view.Surface;
import java.util.Map;

public class TPNativePlayerUtils {
    public static boolean isTPNativePlayerSurface(Surface surface) {
        return surface instanceof TPNativePlayerSurface;
    }

    public static String[] tpMapStringToStringArray(Map<String, String> map) {
        int i = 0;
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        String[] strArr = new String[(map.size() * 2)];
        for (String next : map.keySet()) {
            int i2 = i * 2;
            strArr[i2] = next;
            strArr[i2 + 1] = map.get(next);
            i++;
        }
        return strArr;
    }
}
