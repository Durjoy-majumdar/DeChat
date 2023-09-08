package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f44159d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44160e;

    /* renamed from: f */
    public final /* synthetic */ Surface f44161f;

    public /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$g(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f44159d = stateCallbackExecutorWrapper;
        this.f44160e = cameraCaptureSession;
        this.f44161f = surface;
    }

    public final void run() {
        this.f44159d.lambda$onSurfacePrepared$6(this.f44160e, this.f44161f);
    }
}
