package com.github.henryye.nativeiv;

import java.util.concurrent.ExecutorService;

/* renamed from: com.github.henryye.nativeiv.a */
public enum C80186a {
    INSTANCE;
    

    /* renamed from: g */
    public static int f234723g;

    /* renamed from: d */
    public ExecutorService f234725d;

    /* renamed from: e */
    public ExecutorService f234726e;

    /* access modifiers changed from: public */
    static {
        f234723g = Runtime.getRuntime().availableProcessors() + 1;
    }
}
