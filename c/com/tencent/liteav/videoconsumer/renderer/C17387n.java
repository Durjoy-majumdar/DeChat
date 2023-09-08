package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;
import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.n */
final /* synthetic */ class C17387n implements Runnable {

    /* renamed from: a */
    private final C17383i f47162a;

    private C17387n(C17383i iVar) {
        this.f47162a = iVar;
    }

    /* renamed from: a */
    public static Runnable m17394a(C17383i iVar) {
        return new C17387n(iVar);
    }

    public final void run() {
        C17383i iVar = this.f47162a;
        LiteavLog.m16901i("VideoRenderer", "onSurfaceDestroy " + iVar.f47132f);
        iVar.mo20475a((Surface) null, 0, 0, iVar.f47134h);
    }
}
