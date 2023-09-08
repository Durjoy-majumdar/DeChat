package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoconsumer.renderer.C17380g;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.l */
final /* synthetic */ class C17295l implements Runnable {

    /* renamed from: a */
    private final C17286j f46864a;

    /* renamed from: b */
    private final Rotation f46865b;

    private C17295l(C17286j jVar, Rotation rotation) {
        this.f46864a = jVar;
        this.f46865b = rotation;
    }

    /* renamed from: a */
    public static Runnable m17205a(C17286j jVar, Rotation rotation) {
        return new C17295l(jVar, rotation);
    }

    public final void run() {
        C17286j jVar = this.f46864a;
        Rotation rotation = this.f46865b;
        LiteavLog.m16901i(jVar.f46828a, "setRenderRotation: ".concat(String.valueOf(rotation)));
        jVar.f46838k = rotation;
        for (C17380g next : jVar.mo20326a()) {
            if (next != null) {
                next.mo20307a(jVar.f46838k);
            }
        }
    }
}
