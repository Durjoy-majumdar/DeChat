package com.tencent.liteav.videoproducer.preprocessor;

import android.graphics.Bitmap;
import com.tencent.liteav.beauty.C17125a;
import com.tencent.liteav.beauty.p305b.C104508n;
import com.tencent.liteav.videoproducer.preprocessor.C17548h;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.j */
final /* synthetic */ class C17555j implements Runnable {

    /* renamed from: a */
    private final C17548h f47706a;

    /* renamed from: b */
    private final Bitmap f47707b;

    /* renamed from: c */
    private final float f47708c;

    /* renamed from: d */
    private final float f47709d;

    /* renamed from: e */
    private final float f47710e;

    private C17555j(C17548h hVar, Bitmap bitmap, float f, float f2, float f3) {
        this.f47706a = hVar;
        this.f47707b = bitmap;
        this.f47708c = f;
        this.f47709d = f2;
        this.f47710e = f3;
    }

    /* renamed from: a */
    public static Runnable m17746a(C17548h hVar, Bitmap bitmap, float f, float f2, float f3) {
        return new C17555j(hVar, bitmap, f, f2, f3);
    }

    public final void run() {
        C17548h hVar = this.f47706a;
        Bitmap bitmap = this.f47707b;
        float f = this.f47708c;
        float f2 = this.f47709d;
        float f3 = this.f47710e;
        if (bitmap == null) {
            hVar.mo20821c(C17548h.C17552b.f47696e);
            return;
        }
        C104508n nVar = (C104508n) hVar.mo20815a(C17548h.C17552b.f47696e);
        nVar.mo147184a();
        nVar.mo147185a(bitmap, f, f2, f3);
        C17125a.m16956h(hVar.f47667a);
    }
}
