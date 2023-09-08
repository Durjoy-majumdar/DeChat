package com.tencent.p014mm.xeffect;

/* renamed from: com.tencent.mm.xeffect.GlobalContextCreator */
public class GlobalContextCreator {
    private static native boolean nCheckCreateGlobalContext(String str);

    private static native void nDestroyGlobalContext();

    private static native boolean nIsContextReady();
}
