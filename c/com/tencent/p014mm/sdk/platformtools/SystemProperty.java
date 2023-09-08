package com.tencent.p014mm.sdk.platformtools;

import java.util.HashMap;

/* renamed from: com.tencent.mm.sdk.platformtools.SystemProperty */
public final class SystemProperty {
    private static final HashMap<String, String> PROPERTIES = new HashMap<>();

    private SystemProperty() {
    }

    public static String getProperty(String str) {
        return PROPERTIES.get(str);
    }

    public static void setProperty(String str, String str2) {
        PROPERTIES.put(str, str2);
    }
}
