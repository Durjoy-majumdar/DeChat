package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.u */
final /* synthetic */ class C17393u implements Runnable {

    /* renamed from: a */
    private final C17383i f47174a;

    /* renamed from: b */
    private final boolean f47175b;

    private C17393u(C17383i iVar, boolean z) {
        this.f47174a = iVar;
        this.f47175b = z;
    }

    /* renamed from: a */
    public static Runnable m17400a(C17383i iVar, boolean z) {
        return new C17393u(iVar, z);
    }

    public final void run() {
        C17383i iVar = this.f47174a;
        boolean z = this.f47175b;
        if (iVar.f47141o != z) {
            LiteavLog.m16901i("VideoRenderer", "setHorizontalMirror ".concat(String.valueOf(z)));
        }
        iVar.f47141o = z;
    }
}
