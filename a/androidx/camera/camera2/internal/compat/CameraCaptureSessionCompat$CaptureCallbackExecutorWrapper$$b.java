package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f44121d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44122e;

    /* renamed from: f */
    public final /* synthetic */ CaptureRequest f44123f;

    /* renamed from: g */
    public final /* synthetic */ Surface f44124g;

    /* renamed from: h */
    public final /* synthetic */ long f44125h;

    public /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$b(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.f44121d = captureCallbackExecutorWrapper;
        this.f44122e = cameraCaptureSession;
        this.f44123f = captureRequest;
        this.f44124g = surface;
        this.f44125h = j;
    }

    public final void run() {
        this.f44121d.lambda$onCaptureBufferLost$6(this.f44122e, this.f44123f, this.f44124g, this.f44125h);
    }
}
