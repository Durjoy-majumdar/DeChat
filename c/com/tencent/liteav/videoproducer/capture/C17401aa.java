package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.C104530af;
import com.tencent.liteav.videoproducer.capture.C17455s;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.aa */
final /* synthetic */ class C17401aa implements Runnable {

    /* renamed from: a */
    private final C17455s.C174561 f47224a;

    /* renamed from: b */
    private final boolean f47225b;

    private C17401aa(C17455s.C174561 r1, boolean z) {
        this.f47224a = r1;
        this.f47225b = z;
    }

    /* renamed from: a */
    public static Runnable m17430a(C17455s.C174561 r1, boolean z) {
        return new C17401aa(r1, z);
    }

    public final void run() {
        C17455s.C174561 r0 = this.f47224a;
        boolean z = this.f47225b;
        C17455s sVar = C17455s.this;
        if (!sVar.f47357g) {
            sVar.f47357g = true;
            if (sVar.f47351a != null) {
                C104530af.C104531a cameraAPIType = CameraCaptureSingleton.getInstance().getCameraAPIType();
                if (z) {
                    IVideoReporter iVideoReporter = sVar.f47351a;
                    C17263h.C17269b bVar = C17263h.C17269b.EVT_VIDEO_CAPTURE_CAMERA_START_SUCCESS;
                    iVideoReporter.notifyEvent(bVar, "cameraAPIType " + cameraAPIType + " params:" + sVar.f47356f, new Object[0]);
                } else {
                    IVideoReporter iVideoReporter2 = sVar.f47351a;
                    C17263h.C17268a aVar = C17263h.C17268a.ERR_VIDEO_CAPTURE_CAMERA_INVALID_DEVICE;
                    iVideoReporter2.notifyError(aVar, "cameraAPIType " + cameraAPIType + " params:" + sVar.f47356f, new Object[0]);
                }
            }
        }
        CaptureSourceInterface.C17399a aVar2 = C17455s.this.f47353c;
        if (aVar2 != null) {
            aVar2.mo20533a(z);
        }
    }
}
