package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.base.GLConstants;

/* renamed from: com.tencent.liteav.videoproducer.producer.x */
final /* synthetic */ class C17626x implements Runnable {

    /* renamed from: a */
    private final C17604f f47976a;

    /* renamed from: b */
    private final GLConstants.MirrorMode f47977b;

    private C17626x(C17604f fVar, GLConstants.MirrorMode mirrorMode) {
        this.f47976a = fVar;
        this.f47977b = mirrorMode;
    }

    /* renamed from: a */
    public static Runnable m17913a(C17604f fVar, GLConstants.MirrorMode mirrorMode) {
        return new C17626x(fVar, mirrorMode);
    }

    public final void run() {
        C17604f.m17837a(this.f47976a, this.f47977b);
    }
}
