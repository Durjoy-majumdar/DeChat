package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;

/* renamed from: com.tencent.liteav.videoproducer.encoder.s */
final /* synthetic */ class C17524s implements Runnable {

    /* renamed from: a */
    private final C17520o f47575a;

    /* renamed from: b */
    private final EncodedVideoFrame f47576b;

    /* renamed from: c */
    private final boolean f47577c;

    private C17524s(C17520o oVar, EncodedVideoFrame encodedVideoFrame, boolean z) {
        this.f47575a = oVar;
        this.f47576b = encodedVideoFrame;
        this.f47577c = z;
    }

    /* renamed from: a */
    public static Runnable m17698a(C17520o oVar, EncodedVideoFrame encodedVideoFrame, boolean z) {
        return new C17524s(oVar, encodedVideoFrame, z);
    }

    public final void run() {
        C17520o.m17686a(this.f47575a, this.f47576b, this.f47577c);
    }
}
