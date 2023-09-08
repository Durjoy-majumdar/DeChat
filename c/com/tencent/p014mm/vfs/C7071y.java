package com.tencent.p014mm.vfs;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.y */
public class C7071y {
    /* renamed from: a */
    public static Map<String, Object> m7297a(Map<String, Object> map) {
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value == null || (value instanceof String)) {
                hashMap.put(str, value);
            } else if (value instanceof String[]) {
                String[] strArr = (String[]) value;
                int length = strArr.length;
                if (length == 0) {
                    hashMap.put(str, (Object) null);
                } else if (length != 1) {
                    hashMap.put(str, value);
                } else {
                    hashMap.put(str, strArr[0]);
                }
            }
        }
        return hashMap;
    }
}
