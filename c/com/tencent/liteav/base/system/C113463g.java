package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.system.g */
final /* synthetic */ class C113463g implements Callable {

    /* renamed from: a */
    private static final C113463g f339527a = new C113463g();

    private C113463g() {
    }

    /* renamed from: a */
    public static Callable m155349a() {
        return f339527a;
    }

    public final Object call() {
        return Build.MODEL;
    }
}
