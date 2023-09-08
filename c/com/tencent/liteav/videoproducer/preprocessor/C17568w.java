package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.w */
final /* synthetic */ class C17568w implements Runnable {

    /* renamed from: a */
    private final C17548h f47747a;

    private C17568w(C17548h hVar) {
        this.f47747a = hVar;
    }

    /* renamed from: a */
    public static Runnable m17758a(C17548h hVar) {
        return new C17568w(hVar);
    }

    public final void run() {
        this.f47747a.mo20816a();
        LiteavLog.m16901i("GPUPreprocessor", "destroy gpu preprocessor");
    }
}
