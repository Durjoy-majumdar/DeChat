package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.system.k */
final /* synthetic */ class C113467k implements Callable {

    /* renamed from: a */
    private static final C113467k f339531a = new C113467k();

    private C113467k() {
    }

    /* renamed from: a */
    public static Callable m155353a() {
        return f339531a;
    }

    public final Object call() {
        return Build.VERSION.RELEASE;
    }
}
