package com.tencent.liteav.videoconsumer.renderer;

import android.view.Surface;
import com.tencent.liteav.base.util.C104507p;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.d */
final /* synthetic */ class C17376d implements Runnable {

    /* renamed from: a */
    private final C17370a f47108a;

    /* renamed from: b */
    private final Surface f47109b;

    private C17376d(C17370a aVar, Surface surface) {
        this.f47108a = aVar;
        this.f47109b = surface;
    }

    /* renamed from: a */
    public static Runnable m17355a(C17370a aVar, Surface surface) {
        return new C17376d(aVar, surface);
    }

    public final void run() {
        C17370a aVar = this.f47108a;
        Surface surface = this.f47109b;
        aVar.mo20455c();
        aVar.f47093b = surface;
        if (surface == null) {
            aVar.mo20457e();
            return;
        }
        C104507p pVar = aVar.f47095d;
        aVar.mo20447a(surface, pVar.f309736a, pVar.f309737b, false, false);
    }
}
