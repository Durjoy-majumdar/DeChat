package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.core.impl.CaptureConfig;

public final /* synthetic */ class ProcessingCaptureSession$2$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProcessingCaptureSession.C164842 f44079d;

    /* renamed from: e */
    public final /* synthetic */ CaptureConfig f44080e;

    public /* synthetic */ ProcessingCaptureSession$2$$a(ProcessingCaptureSession.C164842 r1, CaptureConfig captureConfig) {
        this.f44079d = r1;
        this.f44080e = captureConfig;
    }

    public final void run() {
        this.f44079d.lambda$onCaptureSequenceCompleted$1(this.f44080e);
    }
}
