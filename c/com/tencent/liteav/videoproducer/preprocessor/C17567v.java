package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.v */
final /* synthetic */ class C17567v implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47745a;

    /* renamed from: b */
    private final int f47746b;

    private C17567v(VideoPreprocessor videoPreprocessor, int i) {
        this.f47745a = videoPreprocessor;
        this.f47746b = i;
    }

    /* renamed from: a */
    public static Runnable m17757a(VideoPreprocessor videoPreprocessor, int i) {
        return new C17567v(videoPreprocessor, i);
    }

    public final void run() {
        this.f47745a.mPreprocessor.f47671e.setHomeOrientation(this.f47746b);
    }
}
