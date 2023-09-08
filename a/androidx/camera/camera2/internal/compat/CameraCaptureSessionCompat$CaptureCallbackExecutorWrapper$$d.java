package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f44130d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44131e;

    /* renamed from: f */
    public final /* synthetic */ CaptureRequest f44132f;

    /* renamed from: g */
    public final /* synthetic */ CaptureResult f44133g;

    public /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$d(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.f44130d = captureCallbackExecutorWrapper;
        this.f44131e = cameraCaptureSession;
        this.f44132f = captureRequest;
        this.f44133g = captureResult;
    }

    public final void run() {
        this.f44130d.lambda$onCaptureProgressed$1(this.f44131e, this.f44132f, this.f44133g);
    }
}
