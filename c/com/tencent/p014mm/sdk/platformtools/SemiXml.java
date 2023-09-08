package com.tencent.p014mm.sdk.platformtools;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.platformtools.SemiXml */
public class SemiXml {
    public static final String MAGIC_HEAD = "~SEMI_XML~";
    private static final String TAG = "MicroMsg.SemiXml";

    public static Map<String, String> decode(String str) {
        if (str == null || !str.startsWith(MAGIC_HEAD)) {
            return null;
        }
        String substring = str.substring(10);
        HashMap hashMap = new HashMap();
        int length = substring.length() - 4;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            try {
                int i3 = i2 + 1;
                int charAt = (substring.charAt(i) << 16) + substring.charAt(i2) + i3;
                String substring2 = substring.substring(i3, charAt);
                int i4 = charAt + 1;
                int i5 = i4 + 1;
                i = (substring.charAt(charAt) << 16) + substring.charAt(i4) + i5;
                hashMap.put(substring2, substring.substring(i5, i));
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return hashMap;
    }

    public static String encode(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MAGIC_HEAD);
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (str2 != null) {
                int length = str.length();
                int length2 = str2.length();
                sb.append((char) (length >> 16));
                sb.append((char) length);
                sb.append(str);
                sb.append((char) (length2 >> 16));
                sb.append((char) length2);
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
