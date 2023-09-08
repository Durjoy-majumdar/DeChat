package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f44126d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44127e;

    /* renamed from: f */
    public final /* synthetic */ int f44128f;

    /* renamed from: g */
    public final /* synthetic */ long f44129g;

    public /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$c(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i, long j) {
        this.f44126d = captureCallbackExecutorWrapper;
        this.f44127e = cameraCaptureSession;
        this.f44128f = i;
        this.f44129g = j;
    }

    public final void run() {
        this.f44126d.lambda$onCaptureSequenceCompleted$4(this.f44127e, this.f44128f, this.f44129g);
    }
}
