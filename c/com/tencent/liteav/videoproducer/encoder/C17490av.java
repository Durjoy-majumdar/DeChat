package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;

/* renamed from: com.tencent.liteav.videoproducer.encoder.av */
final /* synthetic */ class C17490av implements Runnable {

    /* renamed from: a */
    private final C17474ah f47474a;

    /* renamed from: b */
    private final boolean f47475b;

    /* renamed from: c */
    private final EncodedVideoFrame f47476c;

    private C17490av(C17474ah ahVar, boolean z, EncodedVideoFrame encodedVideoFrame) {
        this.f47474a = ahVar;
        this.f47475b = z;
        this.f47476c = encodedVideoFrame;
    }

    /* renamed from: a */
    public static Runnable m17632a(C17474ah ahVar, boolean z, EncodedVideoFrame encodedVideoFrame) {
        return new C17490av(ahVar, z, encodedVideoFrame);
    }

    public final void run() {
        C17474ah.m17581a(this.f47474a, this.f47475b, this.f47476c);
    }
}
