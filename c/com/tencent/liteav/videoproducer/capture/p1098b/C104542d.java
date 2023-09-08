package com.tencent.liteav.videoproducer.capture.p1098b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import com.tencent.liteav.videoproducer.capture.p1098b.C104534a;

/* renamed from: com.tencent.liteav.videoproducer.capture.b.d */
final /* synthetic */ class C104542d implements Runnable {

    /* renamed from: a */
    private final C104534a.C1045384 f309895a;

    /* renamed from: b */
    private final TotalCaptureResult f309896b;

    /* renamed from: c */
    private final CameraCaptureSession f309897c;

    /* renamed from: d */
    private final CaptureRequest f309898d;

    private C104542d(C104534a.C1045384 r1, TotalCaptureResult totalCaptureResult, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest) {
        this.f309895a = r1;
        this.f309896b = totalCaptureResult;
        this.f309897c = cameraCaptureSession;
        this.f309898d = captureRequest;
    }

    /* renamed from: a */
    public static Runnable m139926a(C104534a.C1045384 r1, TotalCaptureResult totalCaptureResult, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest) {
        return new C104542d(r1, totalCaptureResult, cameraCaptureSession, captureRequest);
    }

    public final void run() {
        C104534a.C1045384.m139922a(this.f309895a, this.f309896b, this.f309897c, this.f309898d);
    }
}
