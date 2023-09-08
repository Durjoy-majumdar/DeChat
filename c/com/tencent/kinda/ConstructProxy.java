package com.tencent.kinda;

public class ConstructProxy {
    public static void proxyDefaultConstructor(Class cls, String str) {
        if (cls != null && str != null) {
            proxyDefaultConstructor(cls.getName(), str);
        }
    }

    private static native void proxyDefaultConstructor(String str, String str2);
}
