package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.ProcessingCaptureSession;

public final /* synthetic */ class ProcessingCaptureSession$SessionProcessorCaptureCallback$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProcessingCaptureSession.SessionProcessorCaptureCallback f44083d;

    public /* synthetic */ ProcessingCaptureSession$SessionProcessorCaptureCallback$$a(ProcessingCaptureSession.SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        this.f44083d = sessionProcessorCaptureCallback;
    }

    public final void run() {
        this.f44083d.lambda$onCaptureSequenceCompleted$1();
    }
}
