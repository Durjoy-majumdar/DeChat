package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;

/* renamed from: com.tencent.liteav.videoproducer.encoder.r */
final /* synthetic */ class C17523r implements Runnable {

    /* renamed from: a */
    private final C17520o f47573a;

    /* renamed from: b */
    private final MediaFormat f47574b;

    private C17523r(C17520o oVar, MediaFormat mediaFormat) {
        this.f47573a = oVar;
        this.f47574b = mediaFormat;
    }

    /* renamed from: a */
    public static Runnable m17697a(C17520o oVar, MediaFormat mediaFormat) {
        return new C17523r(oVar, mediaFormat);
    }

    public final void run() {
        C17520o.m17685a(this.f47573a, this.f47574b);
    }
}
