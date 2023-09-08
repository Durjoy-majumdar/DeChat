package com.tencent.liteav.beauty.p305b;

import android.graphics.Bitmap;
import com.tencent.liteav.videobase.utils.OpenGlUtils;

/* renamed from: com.tencent.liteav.beauty.b.j */
final /* synthetic */ class C17156j implements Runnable {

    /* renamed from: a */
    private final C17155i f46295a;

    /* renamed from: b */
    private final float f46296b;

    /* renamed from: c */
    private final float f46297c;

    /* renamed from: d */
    private final float f46298d;

    /* renamed from: e */
    private final Bitmap f46299e;

    /* renamed from: f */
    private final Bitmap f46300f;

    private C17156j(C17155i iVar, float f, float f2, float f3, Bitmap bitmap, Bitmap bitmap2) {
        this.f46295a = iVar;
        this.f46296b = f;
        this.f46297c = f2;
        this.f46298d = f3;
        this.f46299e = bitmap;
        this.f46300f = bitmap2;
    }

    /* renamed from: a */
    public static Runnable m16989a(C17155i iVar, float f, float f2, float f3, Bitmap bitmap, Bitmap bitmap2) {
        return new C17156j(iVar, f, f2, f3, bitmap, bitmap2);
    }

    public final void run() {
        C17155i iVar = this.f46295a;
        float f = this.f46296b;
        float f2 = this.f46297c;
        float f3 = this.f46298d;
        Bitmap bitmap = this.f46299e;
        Bitmap bitmap2 = this.f46300f;
        iVar.f46289e.put(0, f);
        iVar.f46289e.put(1, f2);
        iVar.f46289e.put(2, f3);
        if (bitmap == null) {
            OpenGlUtils.deleteTexture(iVar.f46286b);
            iVar.f46286b = -1;
            iVar.f46290f.put(0, 0.0f);
        } else if (bitmap != iVar.f46285a) {
            iVar.f46286b = OpenGlUtils.loadTexture(bitmap, iVar.f46286b, false);
            iVar.f46290f.put(0, 1.0f);
        }
        if (bitmap2 == null) {
            OpenGlUtils.deleteTexture(iVar.f46288d);
            iVar.f46288d = -1;
            iVar.f46290f.put(1, 0.0f);
        } else if (bitmap2 != iVar.f46287c) {
            iVar.f46288d = OpenGlUtils.loadTexture(bitmap2, iVar.f46288d, false);
            iVar.f46290f.put(1, 1.0f);
        }
        iVar.f46285a = bitmap;
        iVar.f46287c = bitmap2;
    }
}
