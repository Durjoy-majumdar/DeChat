package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.beauty.p305b.C17149f;
import com.tencent.liteav.videoproducer.preprocessor.C17548h;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.l */
final /* synthetic */ class C17557l implements Runnable {

    /* renamed from: a */
    private final C17548h f47713a;

    /* renamed from: b */
    private final float f47714b;

    private C17557l(C17548h hVar, float f) {
        this.f47713a = hVar;
        this.f47714b = f;
    }

    /* renamed from: a */
    public static Runnable m17748a(C17548h hVar, float f) {
        return new C17557l(hVar, f);
    }

    public final void run() {
        C17548h hVar = this.f47713a;
        float f = this.f47714b;
        if (f < 0.0f) {
            hVar.mo20821c(C17548h.C17552b.f47693b);
            return;
        }
        C17149f fVar = (C17149f) hVar.mo20815a(C17548h.C17552b.f47693b);
        if (fVar != null) {
            fVar.f46267a.mo19424a(f, 0.0f);
            fVar.f46268b.mo19424a(0.0f, f);
        }
    }
}
