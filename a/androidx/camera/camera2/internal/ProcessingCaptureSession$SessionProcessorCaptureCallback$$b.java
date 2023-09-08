package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.ProcessingCaptureSession;

public final /* synthetic */ class ProcessingCaptureSession$SessionProcessorCaptureCallback$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProcessingCaptureSession.SessionProcessorCaptureCallback f44084d;

    public /* synthetic */ ProcessingCaptureSession$SessionProcessorCaptureCallback$$b(ProcessingCaptureSession.SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        this.f44084d = sessionProcessorCaptureCallback;
    }

    public final void run() {
        this.f44084d.lambda$onCaptureFailed$0();
    }
}
