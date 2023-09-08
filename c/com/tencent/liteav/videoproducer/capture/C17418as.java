package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.as */
final /* synthetic */ class C17418as implements Runnable {

    /* renamed from: a */
    private final C17417ar f47271a;

    /* renamed from: b */
    private final CaptureSourceInterface.C17399a f47272b;

    /* renamed from: c */
    private final Object f47273c;

    /* renamed from: d */
    private final CaptureSourceInterface.CaptureParams f47274d;

    private C17418as(C17417ar arVar, CaptureSourceInterface.C17399a aVar, Object obj, CaptureSourceInterface.CaptureParams captureParams) {
        this.f47271a = arVar;
        this.f47272b = aVar;
        this.f47273c = obj;
        this.f47274d = captureParams;
    }

    /* renamed from: a */
    public static Runnable m17482a(C17417ar arVar, CaptureSourceInterface.C17399a aVar, Object obj, CaptureSourceInterface.CaptureParams captureParams) {
        return new C17418as(arVar, aVar, obj, captureParams);
    }

    public final void run() {
        C17417ar.m17476a(this.f47271a, this.f47272b, this.f47273c, this.f47274d);
    }
}
