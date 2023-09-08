package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f44118d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44119e;

    /* renamed from: f */
    public final /* synthetic */ int f44120f;

    public /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$a(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i) {
        this.f44118d = captureCallbackExecutorWrapper;
        this.f44119e = cameraCaptureSession;
        this.f44120f = i;
    }

    public final void run() {
        this.f44118d.lambda$onCaptureSequenceAborted$5(this.f44119e, this.f44120f);
    }
}
