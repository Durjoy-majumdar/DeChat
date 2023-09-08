package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;

public final /* synthetic */ class Camera2CameraControlImpl$CameraCaptureCallbackSet$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureCallback f43983d;

    public /* synthetic */ Camera2CameraControlImpl$CameraCaptureCallbackSet$$b(CameraCaptureCallback cameraCaptureCallback) {
        this.f43983d = cameraCaptureCallback;
    }

    public final void run() {
        this.f43983d.onCaptureCancelled();
    }
}
