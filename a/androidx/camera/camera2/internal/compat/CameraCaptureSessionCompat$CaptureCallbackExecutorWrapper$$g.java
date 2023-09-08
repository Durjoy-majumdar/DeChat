package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f44143d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44144e;

    /* renamed from: f */
    public final /* synthetic */ CaptureRequest f44145f;

    /* renamed from: g */
    public final /* synthetic */ CaptureFailure f44146g;

    public /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$g(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.f44143d = captureCallbackExecutorWrapper;
        this.f44144e = cameraCaptureSession;
        this.f44145f = captureRequest;
        this.f44146g = captureFailure;
    }

    public final void run() {
        this.f44143d.lambda$onCaptureFailed$3(this.f44144e, this.f44145f, this.f44146g);
    }
}
