package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.base.GLConstants;

/* renamed from: com.tencent.liteav.videoproducer.producer.y */
final /* synthetic */ class C17627y implements Runnable {

    /* renamed from: a */
    private final C17604f f47978a;

    /* renamed from: b */
    private final GLConstants.GLScaleType f47979b;

    private C17627y(C17604f fVar, GLConstants.GLScaleType gLScaleType) {
        this.f47978a = fVar;
        this.f47979b = gLScaleType;
    }

    /* renamed from: a */
    public static Runnable m17914a(C17604f fVar, GLConstants.GLScaleType gLScaleType) {
        return new C17627y(fVar, gLScaleType);
    }

    public final void run() {
        C17604f.m17836a(this.f47978a, this.f47979b);
    }
}
