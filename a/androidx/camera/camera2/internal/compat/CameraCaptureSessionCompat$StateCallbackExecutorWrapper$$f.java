package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f44157d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44158e;

    public /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$f(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession) {
        this.f44157d = stateCallbackExecutorWrapper;
        this.f44158e = cameraCaptureSession;
    }

    public final void run() {
        this.f44157d.lambda$onReady$2(this.f44158e);
    }
}
