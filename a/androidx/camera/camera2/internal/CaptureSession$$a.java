package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.CameraBurstCaptureCallback;

public final /* synthetic */ class CaptureSession$$a implements CameraBurstCaptureCallback.CaptureSequenceCallback {

    /* renamed from: a */
    public final /* synthetic */ CaptureSession f44040a;

    public /* synthetic */ CaptureSession$$a(CaptureSession captureSession) {
        this.f44040a = captureSession;
    }

    public final void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        this.f44040a.lambda$issueBurstCaptureRequest$2(cameraCaptureSession, i, z);
    }
}
