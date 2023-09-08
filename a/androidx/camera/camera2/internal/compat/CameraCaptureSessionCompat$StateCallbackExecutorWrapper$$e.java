package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f44155d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44156e;

    public /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$e(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession) {
        this.f44155d = stateCallbackExecutorWrapper;
        this.f44156e = cameraCaptureSession;
    }

    public final void run() {
        this.f44155d.lambda$onConfigureFailed$1(this.f44156e);
    }
}
