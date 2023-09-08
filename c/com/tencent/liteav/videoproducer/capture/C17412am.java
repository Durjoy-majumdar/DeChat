package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoproducer.capture.C17405ah;

/* renamed from: com.tencent.liteav.videoproducer.capture.am */
final /* synthetic */ class C17412am implements Runnable {

    /* renamed from: a */
    private final C17405ah f47260a;

    private C17412am(C17405ah ahVar) {
        this.f47260a = ahVar;
    }

    /* renamed from: a */
    public static Runnable m17462a(C17405ah ahVar) {
        return new C17412am(ahVar);
    }

    public final void run() {
        C17405ah ahVar = this.f47260a;
        if (ahVar.f47239k != C17405ah.C17407a.PAUSED) {
            LiteavLog.m16905w("CaptureController", "resume capture but mStatus is " + ahVar.f47239k);
            return;
        }
        ahVar.f47239k = C17405ah.C17407a.STARTED;
        VirtualCamera virtualCamera = ahVar.f47229a;
        if (virtualCamera != null) {
            virtualCamera.stop();
            ahVar.f47229a = null;
        }
        CaptureSourceInterface captureSourceInterface = ahVar.f47231c;
        if (captureSourceInterface != null) {
            captureSourceInterface.resume();
        }
    }
}
