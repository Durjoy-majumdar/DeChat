package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.system.h */
final /* synthetic */ class C113464h implements Callable {

    /* renamed from: a */
    private static final C113464h f339528a = new C113464h();

    private C113464h() {
    }

    /* renamed from: a */
    public static Callable m155350a() {
        return f339528a;
    }

    public final Object call() {
        return Build.BRAND;
    }
}
