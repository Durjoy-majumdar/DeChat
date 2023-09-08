package com.tencent.liteav.videoproducer.preprocessor;

import android.graphics.Bitmap;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.r */
final /* synthetic */ class C17563r implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47730a;

    /* renamed from: b */
    private final float f47731b;

    /* renamed from: c */
    private final Bitmap f47732c;

    /* renamed from: d */
    private final float f47733d;

    /* renamed from: e */
    private final Bitmap f47734e;

    /* renamed from: f */
    private final float f47735f;

    private C17563r(VideoPreprocessor videoPreprocessor, float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        this.f47730a = videoPreprocessor;
        this.f47731b = f;
        this.f47732c = bitmap;
        this.f47733d = f2;
        this.f47734e = bitmap2;
        this.f47735f = f3;
    }

    /* renamed from: a */
    public static Runnable m17753a(VideoPreprocessor videoPreprocessor, float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        return new C17563r(videoPreprocessor, f, bitmap, f2, bitmap2, f3);
    }

    public final void run() {
        this.f47730a.mPreprocessor.mo20817a(this.f47731b, this.f47732c, this.f47733d, this.f47734e, this.f47735f);
    }
}
