package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.beauty.p305b.C17152h;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videoproducer.preprocessor.C17548h;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.p */
final /* synthetic */ class C17561p implements Runnable {

    /* renamed from: a */
    private final C17548h f47726a;

    /* renamed from: b */
    private final GLConstants.GLScaleType f47727b;

    /* renamed from: c */
    private final boolean f47728c;

    private C17561p(C17548h hVar, GLConstants.GLScaleType gLScaleType, boolean z) {
        this.f47726a = hVar;
        this.f47727b = gLScaleType;
        this.f47728c = z;
    }

    /* renamed from: a */
    public static Runnable m17752a(C17548h hVar, GLConstants.GLScaleType gLScaleType, boolean z) {
        return new C17561p(hVar, gLScaleType, z);
    }

    public final void run() {
        C17548h hVar = this.f47726a;
        GLConstants.GLScaleType gLScaleType = this.f47727b;
        boolean z = this.f47728c;
        C17152h hVar2 = (C17152h) hVar.mo20818b(C17548h.C17552b.f47695d);
        if (hVar2 != null) {
            hVar2.f46274a = gLScaleType;
            hVar2.f46275b = z;
        }
    }
}
