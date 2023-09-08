package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f44153d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44154e;

    public /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$d(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession) {
        this.f44153d = stateCallbackExecutorWrapper;
        this.f44154e = cameraCaptureSession;
    }

    public final void run() {
        this.f44153d.lambda$onActive$3(this.f44154e);
    }
}
