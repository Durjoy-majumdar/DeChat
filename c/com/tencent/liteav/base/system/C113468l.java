package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.system.l */
final /* synthetic */ class C113468l implements Callable {

    /* renamed from: a */
    private static final C113468l f339532a = new C113468l();

    private C113468l() {
    }

    /* renamed from: a */
    public static Callable m155354a() {
        return f339532a;
    }

    public final Object call() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
