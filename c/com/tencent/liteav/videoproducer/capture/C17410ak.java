package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoproducer.capture.C17405ah;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.ScreenCapturer;

/* renamed from: com.tencent.liteav.videoproducer.capture.ak */
final /* synthetic */ class C17410ak implements Runnable {

    /* renamed from: a */
    private final C17405ah f47255a;

    /* renamed from: b */
    private final CaptureSourceInterface.CaptureParams f47256b;

    /* renamed from: c */
    private final CaptureSourceInterface.C17399a f47257c;

    /* renamed from: d */
    private final Object f47258d;

    private C17410ak(C17405ah ahVar, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.C17399a aVar, Object obj) {
        this.f47255a = ahVar;
        this.f47256b = captureParams;
        this.f47257c = aVar;
        this.f47258d = obj;
    }

    /* renamed from: a */
    public static Runnable m17460a(C17405ah ahVar, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.C17399a aVar, Object obj) {
        return new C17410ak(ahVar, captureParams, aVar, obj);
    }

    public final void run() {
        C17405ah ahVar = this.f47255a;
        CaptureSourceInterface.CaptureParams captureParams = this.f47256b;
        CaptureSourceInterface.C17399a aVar = this.f47257c;
        Object obj = this.f47258d;
        if (ahVar.f47239k != C17405ah.C17407a.STOPED) {
            LiteavLog.m16905w("CaptureController", "Start capture but mStatus is " + ahVar.f47239k);
            return;
        }
        ahVar.f47241m.mo20223b();
        ahVar.f47239k = C17405ah.C17407a.STARTED;
        if (captureParams instanceof CameraCaptureParams) {
            ahVar.f47231c = new C17455s(ahVar.f47236h, ahVar.f47234f);
        } else if (captureParams instanceof ScreenCapturer.ScreenCaptureParams) {
            ahVar.f47231c = new ScreenCapturer(ahVar.f47235g, ahVar.f47234f, ahVar.f47236h);
        } else {
            LiteavLog.m16905w("CaptureController", "initCaptureSource： param is VirtualCameraParams");
        }
        ahVar.f47233e = aVar;
        ahVar.f47232d = captureParams;
        ahVar.f47237i = obj;
        CaptureSourceInterface captureSourceInterface = ahVar.f47231c;
        if (captureSourceInterface != null) {
            captureSourceInterface.start(obj, captureParams, ahVar.f47242n);
        }
    }
}
