package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f44138d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44139e;

    /* renamed from: f */
    public final /* synthetic */ CaptureRequest f44140f;

    /* renamed from: g */
    public final /* synthetic */ long f44141g;

    /* renamed from: h */
    public final /* synthetic */ long f44142h;

    public /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$f(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.f44138d = captureCallbackExecutorWrapper;
        this.f44139e = cameraCaptureSession;
        this.f44140f = captureRequest;
        this.f44141g = j;
        this.f44142h = j2;
    }

    public final void run() {
        this.f44138d.lambda$onCaptureStarted$0(this.f44139e, this.f44140f, this.f44141g, this.f44142h);
    }
}
