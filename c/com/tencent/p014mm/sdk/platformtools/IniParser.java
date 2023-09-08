package com.tencent.p014mm.sdk.platformtools;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.platformtools.IniParser */
public class IniParser {
    public static Map<String, String> parse(String str) {
        String[] split;
        if (str == null || str.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && (split = str2.trim().split("=", 2)) != null && split.length >= 2) {
                String str3 = split[0];
                String str4 = split[1];
                if (str3 != null && str3.length() > 0 && str3.matches("^[a-zA-Z0-9_.]*")) {
                    hashMap.put(str3, str4);
                }
            }
        }
        return hashMap;
    }
}
