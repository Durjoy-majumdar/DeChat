package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.s */
final /* synthetic */ class C17391s implements Runnable {

    /* renamed from: a */
    private final C17383i f47170a;

    /* renamed from: b */
    private final GLConstants.GLScaleType f47171b;

    private C17391s(C17383i iVar, GLConstants.GLScaleType gLScaleType) {
        this.f47170a = iVar;
        this.f47171b = gLScaleType;
    }

    /* renamed from: a */
    public static Runnable m17398a(C17383i iVar, GLConstants.GLScaleType gLScaleType) {
        return new C17391s(iVar, gLScaleType);
    }

    public final void run() {
        C17383i iVar = this.f47170a;
        GLConstants.GLScaleType gLScaleType = this.f47171b;
        LiteavLog.m16901i("VideoRenderer", "setScaleType ".concat(String.valueOf(gLScaleType)));
        iVar.f47139m = gLScaleType;
    }
}
