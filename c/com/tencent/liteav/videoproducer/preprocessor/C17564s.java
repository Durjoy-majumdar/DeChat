package com.tencent.liteav.videoproducer.preprocessor;

import android.graphics.Bitmap;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.s */
final /* synthetic */ class C17564s implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47736a;

    /* renamed from: b */
    private final Bitmap f47737b;

    /* renamed from: c */
    private final float f47738c;

    /* renamed from: d */
    private final float f47739d;

    /* renamed from: e */
    private final float f47740e;

    private C17564s(VideoPreprocessor videoPreprocessor, Bitmap bitmap, float f, float f2, float f3) {
        this.f47736a = videoPreprocessor;
        this.f47737b = bitmap;
        this.f47738c = f;
        this.f47739d = f2;
        this.f47740e = f3;
    }

    /* renamed from: a */
    public static Runnable m17754a(VideoPreprocessor videoPreprocessor, Bitmap bitmap, float f, float f2, float f3) {
        return new C17564s(videoPreprocessor, bitmap, f, f2, f3);
    }

    public final void run() {
        VideoPreprocessor.lambda$setWatermark$10(this.f47736a, this.f47737b, this.f47738c, this.f47739d, this.f47740e);
    }
}
