package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.system.i */
final /* synthetic */ class C113465i implements Callable {

    /* renamed from: a */
    private static final C113465i f339529a = new C113465i();

    private C113465i() {
    }

    /* renamed from: a */
    public static Callable m155351a() {
        return f339529a;
    }

    public final Object call() {
        return Build.MANUFACTURER;
    }
}
