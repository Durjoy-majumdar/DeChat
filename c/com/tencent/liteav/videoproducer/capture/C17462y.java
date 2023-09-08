package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.y */
final /* synthetic */ class C17462y implements Runnable {

    /* renamed from: a */
    private final C17455s f47369a;

    /* renamed from: b */
    private final CaptureSourceInterface.CaptureParams f47370b;

    private C17462y(C17455s sVar, CaptureSourceInterface.CaptureParams captureParams) {
        this.f47369a = sVar;
        this.f47370b = captureParams;
    }

    /* renamed from: a */
    public static Runnable m17548a(C17455s sVar, CaptureSourceInterface.CaptureParams captureParams) {
        return new C17462y(sVar, captureParams);
    }

    public final void run() {
        C17455s sVar = this.f47369a;
        sVar.f47356f = new CameraCaptureParams((CameraCaptureParams) this.f47370b);
        if (sVar.f47354d) {
            sVar.f47355e = true;
            return;
        }
        CameraCaptureSingleton.getInstance().updateParams(sVar.f47356f);
        sVar.f47356f.f47179a = null;
    }
}
