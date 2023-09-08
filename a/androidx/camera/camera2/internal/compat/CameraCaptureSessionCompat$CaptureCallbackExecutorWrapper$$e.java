package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f44134d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44135e;

    /* renamed from: f */
    public final /* synthetic */ CaptureRequest f44136f;

    /* renamed from: g */
    public final /* synthetic */ TotalCaptureResult f44137g;

    public /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$e(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f44134d = captureCallbackExecutorWrapper;
        this.f44135e = cameraCaptureSession;
        this.f44136f = captureRequest;
        this.f44137g = totalCaptureResult;
    }

    public final void run() {
        this.f44134d.lambda$onCaptureCompleted$2(this.f44135e, this.f44136f, this.f44137g);
    }
}
