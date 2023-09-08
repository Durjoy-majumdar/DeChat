package com.tencent.liteav.videoproducer.preprocessor;

import java.util.List;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.t */
final /* synthetic */ class C17565t implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47741a;

    /* renamed from: b */
    private final List f47742b;

    private C17565t(VideoPreprocessor videoPreprocessor, List list) {
        this.f47741a = videoPreprocessor;
        this.f47742b = list;
    }

    /* renamed from: a */
    public static Runnable m17755a(VideoPreprocessor videoPreprocessor, List list) {
        return new C17565t(videoPreprocessor, list);
    }

    public final void run() {
        VideoPreprocessor.lambda$setWatermarkList$11(this.f47741a, this.f47742b);
    }
}
