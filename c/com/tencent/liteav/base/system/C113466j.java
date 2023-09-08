package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.system.j */
final /* synthetic */ class C113466j implements Callable {

    /* renamed from: a */
    private static final C113466j f339530a = new C113466j();

    private C113466j() {
    }

    /* renamed from: a */
    public static Callable m155352a() {
        return f339530a;
    }

    public final Object call() {
        return Build.HARDWARE;
    }
}
