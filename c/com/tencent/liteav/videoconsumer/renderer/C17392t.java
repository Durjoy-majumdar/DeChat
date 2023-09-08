package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.t */
final /* synthetic */ class C17392t implements Runnable {

    /* renamed from: a */
    private final C17383i f47172a;

    /* renamed from: b */
    private final Rotation f47173b;

    private C17392t(C17383i iVar, Rotation rotation) {
        this.f47172a = iVar;
        this.f47173b = rotation;
    }

    /* renamed from: a */
    public static Runnable m17399a(C17383i iVar, Rotation rotation) {
        return new C17392t(iVar, rotation);
    }

    public final void run() {
        C17383i iVar = this.f47172a;
        Rotation rotation = this.f47173b;
        LiteavLog.m16901i("VideoRenderer", "setRenderRotation ".concat(String.valueOf(rotation)));
        iVar.f47140n = rotation;
    }
}
