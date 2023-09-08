package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.renderer.C17380g;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.ac */
final /* synthetic */ class C17275ac implements Runnable {

    /* renamed from: a */
    private final C17286j f46805a;

    /* renamed from: b */
    private final boolean f46806b;

    private C17275ac(C17286j jVar, boolean z) {
        this.f46805a = jVar;
        this.f46806b = z;
    }

    /* renamed from: a */
    public static Runnable m17180a(C17286j jVar, boolean z) {
        return new C17275ac(jVar, z);
    }

    public final void run() {
        C17286j jVar = this.f46805a;
        boolean z = this.f46806b;
        LiteavLog.m16901i(jVar.f46828a, "setRenderMirrorEnabled: ".concat(String.valueOf(z)));
        jVar.f46839l = z;
        for (C17380g next : jVar.mo20326a()) {
            if (next != null) {
                next.mo20311b(jVar.f46839l);
            }
        }
    }
}
