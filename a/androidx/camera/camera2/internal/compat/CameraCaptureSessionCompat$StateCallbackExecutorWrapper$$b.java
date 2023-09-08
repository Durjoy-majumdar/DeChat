package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f44149d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44150e;

    public /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$b(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession) {
        this.f44149d = stateCallbackExecutorWrapper;
        this.f44150e = cameraCaptureSession;
    }

    public final void run() {
        this.f44149d.lambda$onClosed$5(this.f44150e);
    }
}
