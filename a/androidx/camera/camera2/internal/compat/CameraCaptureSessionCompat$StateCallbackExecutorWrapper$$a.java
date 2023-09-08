package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

public final /* synthetic */ class CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f44147d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureSession f44148e;

    public /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$a(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession) {
        this.f44147d = stateCallbackExecutorWrapper;
        this.f44148e = cameraCaptureSession;
    }

    public final void run() {
        this.f44147d.lambda$onConfigured$0(this.f44148e);
    }
}
