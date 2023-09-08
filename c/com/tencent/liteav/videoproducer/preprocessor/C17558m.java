package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.beauty.p305b.C17155i;
import com.tencent.liteav.beauty.p305b.C17157k;
import com.tencent.liteav.videoproducer.preprocessor.C17548h;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.m */
final /* synthetic */ class C17558m implements Runnable {

    /* renamed from: a */
    private final C17548h f47715a;

    /* renamed from: b */
    private final float f47716b;

    private C17558m(C17548h hVar, float f) {
        this.f47715a = hVar;
        this.f47716b = f;
    }

    /* renamed from: a */
    public static Runnable m17749a(C17548h hVar, float f) {
        return new C17558m(hVar, f);
    }

    public final void run() {
        C17548h hVar = this.f47715a;
        float f = this.f47716b;
        C17155i iVar = (C17155i) hVar.mo20818b(C17548h.C17552b.f47694c);
        if (iVar != null) {
            iVar.runOnDraw(new C17157k(iVar, f));
        }
    }
}
