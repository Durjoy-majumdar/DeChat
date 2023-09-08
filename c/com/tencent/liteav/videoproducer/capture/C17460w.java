package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.w */
final /* synthetic */ class C17460w implements Runnable {

    /* renamed from: a */
    private final C17455s f47364a;

    /* renamed from: b */
    private final CaptureSourceInterface.CaptureParams f47365b;

    /* renamed from: c */
    private final CaptureSourceInterface.C17399a f47366c;

    /* renamed from: d */
    private final Object f47367d;

    private C17460w(C17455s sVar, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.C17399a aVar, Object obj) {
        this.f47364a = sVar;
        this.f47365b = captureParams;
        this.f47366c = aVar;
        this.f47367d = obj;
    }

    /* renamed from: a */
    public static Runnable m17546a(C17455s sVar, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.C17399a aVar, Object obj) {
        return new C17460w(sVar, captureParams, aVar, obj);
    }

    public final void run() {
        C17455s sVar = this.f47364a;
        CaptureSourceInterface.CaptureParams captureParams = this.f47365b;
        CaptureSourceInterface.C17399a aVar = this.f47366c;
        Object obj = this.f47367d;
        sVar.f47357g = false;
        sVar.f47354d = false;
        sVar.f47356f = new CameraCaptureParams((CameraCaptureParams) captureParams);
        sVar.f47353c = aVar;
        CameraCaptureSingleton.getInstance().start(obj, sVar.f47356f, sVar.f47358h);
        sVar.f47356f.f47179a = null;
    }
}
