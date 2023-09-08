package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.ab */
final /* synthetic */ class C17536ab implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47641a;

    /* renamed from: b */
    private final int f47642b;

    /* renamed from: c */
    private final C17541ag f47643c;

    private C17536ab(VideoPreprocessor videoPreprocessor, int i, C17541ag agVar) {
        this.f47641a = videoPreprocessor;
        this.f47642b = i;
        this.f47643c = agVar;
    }

    /* renamed from: a */
    public static Runnable m17722a(VideoPreprocessor videoPreprocessor, int i, C17541ag agVar) {
        return new C17536ab(videoPreprocessor, i, agVar);
    }

    public final void run() {
        VideoPreprocessor.lambda$unregisterVideoProcessedListener$4(this.f47641a, this.f47642b, this.f47643c);
    }
}
