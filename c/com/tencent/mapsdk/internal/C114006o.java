package com.tencent.mapsdk.internal;

import java.util.HashMap;

/* renamed from: com.tencent.mapsdk.internal.o */
public final class C114006o {

    /* renamed from: a */
    private static HashMap<String, String> f340985a = new HashMap<>();

    private C114006o() {
    }

    /* renamed from: a */
    public static <T extends C114029p> void m158420a(Class<T> cls) {
        try {
            C114029p pVar = (C114029p) cls.newInstance();
            if (pVar != null) {
                String className = pVar.className();
                if ("".equals(className)) {
                    className = cls.getName();
                }
                f340985a.put(className, cls.getName());
            }
        } catch (IllegalAccessException | InstantiationException unused) {
        }
    }

    /* renamed from: a */
    public static String m158419a(String str) {
        return f340985a.get(str);
    }
}
