package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;

public final /* synthetic */ class SynchronizedCaptureSessionImpl$$d implements WaitForRepeatingRequestStart.SingleRepeatingRequest {

    /* renamed from: a */
    public final /* synthetic */ SynchronizedCaptureSessionImpl f44099a;

    public /* synthetic */ SynchronizedCaptureSessionImpl$$d(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl) {
        this.f44099a = synchronizedCaptureSessionImpl;
    }

    public final int run(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f44099a.lambda$setSingleRepeatingRequest$1(captureRequest, captureCallback);
    }
}
