package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videoconsumer.renderer.C17380g;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.m */
final /* synthetic */ class C17296m implements Runnable {

    /* renamed from: a */
    private final C17286j f46866a;

    /* renamed from: b */
    private final GLConstants.GLScaleType f46867b;

    private C17296m(C17286j jVar, GLConstants.GLScaleType gLScaleType) {
        this.f46866a = jVar;
        this.f46867b = gLScaleType;
    }

    /* renamed from: a */
    public static Runnable m17206a(C17286j jVar, GLConstants.GLScaleType gLScaleType) {
        return new C17296m(jVar, gLScaleType);
    }

    public final void run() {
        C17286j jVar = this.f46866a;
        GLConstants.GLScaleType gLScaleType = this.f46867b;
        LiteavLog.m16901i(jVar.f46828a, "setScaleType: ".concat(String.valueOf(gLScaleType)));
        jVar.f46837j = gLScaleType;
        for (C17380g next : jVar.mo20326a()) {
            if (next != null) {
                next.mo20303a(gLScaleType);
            }
        }
    }
}
