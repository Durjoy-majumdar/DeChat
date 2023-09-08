package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.v */
final /* synthetic */ class C17394v implements Runnable {

    /* renamed from: a */
    private final C17383i f47176a;

    /* renamed from: b */
    private final boolean f47177b;

    private C17394v(C17383i iVar, boolean z) {
        this.f47176a = iVar;
        this.f47177b = z;
    }

    /* renamed from: a */
    public static Runnable m17401a(C17383i iVar, boolean z) {
        return new C17394v(iVar, z);
    }

    public final void run() {
        C17383i iVar = this.f47176a;
        boolean z = this.f47177b;
        if (iVar.f47142p != z) {
            LiteavLog.m16901i("VideoRenderer", "setVerticalMirror ".concat(String.valueOf(z)));
        }
        iVar.f47142p = z;
    }
}
