package com.google.android.gms.common.util;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static <K, V> K getKeyFromMap(Map<K, V> map, K k) {
        if (!map.containsKey(k)) {
            return null;
        }
        for (K next : map.keySet()) {
            if (next.equals(k)) {
                return next;
            }
        }
        return null;
    }

    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            String str = hashMap.get(next);
            sb.append(FastJsonResponse.QUOTE);
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(FastJsonResponse.QUOTE);
                sb.append(str);
                sb.append(FastJsonResponse.QUOTE);
            }
        }
        sb.append("}");
    }
}
