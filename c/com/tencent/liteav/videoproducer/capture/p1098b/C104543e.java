package com.tencent.liteav.videoproducer.capture.p1098b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.tencent.liteav.videoproducer.capture.p1098b.C104534a;

/* renamed from: com.tencent.liteav.videoproducer.capture.b.e */
final /* synthetic */ class C104543e implements Runnable {

    /* renamed from: a */
    private final C104534a.C1045384 f309899a;

    /* renamed from: b */
    private final CaptureRequest f309900b;

    /* renamed from: c */
    private final CameraCaptureSession f309901c;

    private C104543e(C104534a.C1045384 r1, CaptureRequest captureRequest, CameraCaptureSession cameraCaptureSession) {
        this.f309899a = r1;
        this.f309900b = captureRequest;
        this.f309901c = cameraCaptureSession;
    }

    /* renamed from: a */
    public static Runnable m139927a(C104534a.C1045384 r1, CaptureRequest captureRequest, CameraCaptureSession cameraCaptureSession) {
        return new C104543e(r1, captureRequest, cameraCaptureSession);
    }

    public final void run() {
        C104534a.C1045384.m139921a(this.f309899a, this.f309900b, this.f309901c);
    }
}
