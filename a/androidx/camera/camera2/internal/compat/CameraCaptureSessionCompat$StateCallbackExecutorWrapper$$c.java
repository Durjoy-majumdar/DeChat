package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f44151d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44152e;

    public /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$c(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession) {
        this.f44151d = stateCallbackExecutorWrapper;
        this.f44152e = cameraCaptureSession;
    }

    public final void run() {
        this.f44151d.lambda$onCaptureQueueEmpty$4(this.f44152e);
    }
}
