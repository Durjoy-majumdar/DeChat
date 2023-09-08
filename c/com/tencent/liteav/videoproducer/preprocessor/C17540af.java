package com.tencent.liteav.videoproducer.preprocessor;

import android.graphics.Bitmap;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.af */
final /* synthetic */ class C17540af implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47652a;

    /* renamed from: b */
    private final Bitmap f47653b;

    private C17540af(VideoPreprocessor videoPreprocessor, Bitmap bitmap) {
        this.f47652a = videoPreprocessor;
        this.f47653b = bitmap;
    }

    /* renamed from: a */
    public static Runnable m17726a(VideoPreprocessor videoPreprocessor, Bitmap bitmap) {
        return new C17540af(videoPreprocessor, bitmap);
    }

    public final void run() {
        this.f47652a.mPreprocessor.mo20817a(1.0f, this.f47653b, this.f47652a.mLookupMixLevel, (Bitmap) null, 0.0f);
    }
}
