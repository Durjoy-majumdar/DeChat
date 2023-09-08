package com.tencent.liteav.videobase.p1096b;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.OpenGlUtils;

/* renamed from: com.tencent.liteav.videobase.b.d */
public final /* synthetic */ class C104515d implements Runnable {

    /* renamed from: a */
    private final C104514c f309781a;

    private C104515d(C104514c cVar) {
        this.f309781a = cVar;
    }

    /* renamed from: a */
    public static Runnable m139821a(C104514c cVar) {
        return new C104515d(cVar);
    }

    public final void run() {
        C104514c cVar = this.f309781a;
        C104516e eVar = cVar.f309779d;
        if (eVar != null) {
            try {
                eVar.mo147195a();
                OpenGlUtils.deleteShaderId(cVar.f309777b.getAndSet(-1));
            } catch (C104518g e) {
                LiteavLog.m16902i("EGLContextChecker", "release EGLCore failed.", e);
            }
            C104516e.m139822a(cVar.f309779d);
            cVar.f309779d = null;
        }
    }
}
