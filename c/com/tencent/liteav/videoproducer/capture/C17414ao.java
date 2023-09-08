package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.capture.C17405ah;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.ao */
final /* synthetic */ class C17414ao implements Runnable {

    /* renamed from: a */
    private final C17405ah f47262a;

    /* renamed from: b */
    private final CaptureSourceInterface.CaptureParams f47263b;

    private C17414ao(C17405ah ahVar, CaptureSourceInterface.CaptureParams captureParams) {
        this.f47262a = ahVar;
        this.f47263b = captureParams;
    }

    /* renamed from: a */
    public static Runnable m17464a(C17405ah ahVar, CaptureSourceInterface.CaptureParams captureParams) {
        return new C17414ao(ahVar, captureParams);
    }

    public final void run() {
        VirtualCamera virtualCamera;
        C17405ah ahVar = this.f47262a;
        CaptureSourceInterface.CaptureParams captureParams = this.f47263b;
        CaptureSourceInterface captureSourceInterface = ahVar.f47231c;
        if (captureSourceInterface != null) {
            ahVar.f47232d = captureParams;
            C17405ah.C17407a aVar = ahVar.f47239k;
            if (aVar == C17405ah.C17407a.STARTED) {
                captureSourceInterface.updateParams(captureParams);
            } else if (aVar == C17405ah.C17407a.PAUSED) {
                captureSourceInterface.updateParams(captureParams);
                if (ahVar.f47238j && (virtualCamera = ahVar.f47229a) != null) {
                    virtualCamera.updateParams(ahVar.f47232d);
                }
            }
        }
    }
}
