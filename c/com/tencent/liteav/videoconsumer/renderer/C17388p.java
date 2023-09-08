package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.p */
final /* synthetic */ class C17388p implements Runnable {

    /* renamed from: a */
    private final C17383i f47163a;

    /* renamed from: b */
    private final boolean f47164b;

    private C17388p(C17383i iVar, boolean z) {
        this.f47163a = iVar;
        this.f47164b = z;
    }

    /* renamed from: a */
    public static Runnable m17395a(C17383i iVar, boolean z) {
        return new C17388p(iVar, z);
    }

    public final void run() {
        Surface surface;
        C17383i iVar = this.f47163a;
        boolean z = this.f47164b;
        LiteavLog.m16901i("VideoRenderer", "Stop");
        if (!iVar.f47143q) {
            LiteavLog.m16905w("VideoRenderer", "renderer is not started!");
            return;
        }
        iVar.f47143q = false;
        iVar.f47145s = null;
        iVar.f47129c.mo20451a((DisplayTarget) null);
        DisplayTarget displayTarget = iVar.f47131e;
        if (displayTarget != null && z) {
            displayTarget.hideAll();
        }
        iVar.f47138l.mo20219b();
        iVar.mo20478b();
        if (iVar.f47134h && (surface = iVar.f47132f) != null) {
            surface.release();
            iVar.f47134h = false;
        }
        iVar.f47132f = null;
        C104507p pVar = iVar.f47133g;
        pVar.f309737b = 0;
        pVar.f309736a = 0;
        iVar.f47144r = false;
    }
}
