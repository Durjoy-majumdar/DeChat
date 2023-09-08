package com.tencent.liteav.videoproducer.preprocessor;

import android.graphics.Bitmap;
import com.tencent.liteav.beauty.C17125a;
import com.tencent.liteav.beauty.p305b.C17155i;
import com.tencent.liteav.videoproducer.preprocessor.C17548h;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.n */
final /* synthetic */ class C17559n implements Runnable {

    /* renamed from: a */
    private final C17548h f47717a;

    /* renamed from: b */
    private final Bitmap f47718b;

    /* renamed from: c */
    private final Bitmap f47719c;

    /* renamed from: d */
    private final float f47720d;

    /* renamed from: e */
    private final float f47721e;

    /* renamed from: f */
    private final float f47722f;

    private C17559n(C17548h hVar, Bitmap bitmap, Bitmap bitmap2, float f, float f2, float f3) {
        this.f47717a = hVar;
        this.f47718b = bitmap;
        this.f47719c = bitmap2;
        this.f47720d = f;
        this.f47721e = f2;
        this.f47722f = f3;
    }

    /* renamed from: a */
    public static Runnable m17750a(C17548h hVar, Bitmap bitmap, Bitmap bitmap2, float f, float f2, float f3) {
        return new C17559n(hVar, bitmap, bitmap2, f, f2, f3);
    }

    public final void run() {
        C17548h hVar = this.f47717a;
        Bitmap bitmap = this.f47718b;
        Bitmap bitmap2 = this.f47719c;
        float f = this.f47720d;
        float f2 = this.f47721e;
        float f3 = this.f47722f;
        if (bitmap == null && bitmap2 == null) {
            hVar.mo20821c(C17548h.C17552b.f47694c);
            return;
        }
        ((C17155i) hVar.mo20815a(C17548h.C17552b.f47694c)).mo19426a(f, bitmap, f2, bitmap2, f3);
        C17125a.m16954f(hVar.f47667a);
    }
}
