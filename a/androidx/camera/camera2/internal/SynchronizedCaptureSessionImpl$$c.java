package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;

public final /* synthetic */ class SynchronizedCaptureSessionImpl$$c implements ForceCloseCaptureSession.OnConfigured {

    /* renamed from: a */
    public final /* synthetic */ SynchronizedCaptureSessionImpl f44098a;

    public /* synthetic */ SynchronizedCaptureSessionImpl$$c(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl) {
        this.f44098a = synchronizedCaptureSessionImpl;
    }

    public final void run(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.f44098a.lambda$onConfigured$2(synchronizedCaptureSession);
    }
}
