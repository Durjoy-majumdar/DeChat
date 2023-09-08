package com.tencent.p014mm.plugin.appbrand.appcache;

import p206nj.C88957l;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.MD5JNILoadGuard */
public final class MD5JNILoadGuard {
    private static final boolean[] sLoadedFlag = {false};

    private MD5JNILoadGuard() {
    }

    public static boolean ensureNativeLibrariesLoaded() {
        boolean[] zArr = sLoadedFlag;
        if (zArr[0]) {
            return true;
        }
        try {
            C88957l.m111079o("appbrandcommon", MD5JNILoadGuard.class.getClassLoader());
            zArr[0] = true;
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }
}
