package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.core.impl.CaptureConfig;

public final /* synthetic */ class ProcessingCaptureSession$2$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProcessingCaptureSession.C164842 f44081d;

    /* renamed from: e */
    public final /* synthetic */ CaptureConfig f44082e;

    public /* synthetic */ ProcessingCaptureSession$2$$b(ProcessingCaptureSession.C164842 r1, CaptureConfig captureConfig) {
        this.f44081d = r1;
        this.f44082e = captureConfig;
    }

    public final void run() {
        this.f44081d.lambda$onCaptureFailed$0(this.f44082e);
    }
}
