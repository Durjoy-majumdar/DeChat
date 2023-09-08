package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.system.m */
final /* synthetic */ class C113469m implements Callable {

    /* renamed from: a */
    private static final C113469m f339533a = new C113469m();

    private C113469m() {
    }

    /* renamed from: a */
    public static Callable m155355a() {
        return f339533a;
    }

    public final Object call() {
        return Build.BOARD;
    }
}
