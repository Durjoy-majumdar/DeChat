package com.tencent.p014mm.sdk.platformtools;

import java.math.BigInteger;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.sdk.platformtools.ConvertUtils */
public class ConvertUtils {
    public static String longToString(long j) {
        return new BigInteger(Long.toBinaryString(j), 2).toString();
    }

    public static JSONObject map2Json(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String next : map.keySet()) {
                jSONObject.put(next, map.get(next));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
