package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;

public final /* synthetic */ class Camera2CameraControlImpl$CameraCaptureCallbackSet$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureCallback f43984d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureResult f43985e;

    public /* synthetic */ Camera2CameraControlImpl$CameraCaptureCallbackSet$$c(CameraCaptureCallback cameraCaptureCallback, CameraCaptureResult cameraCaptureResult) {
        this.f43984d = cameraCaptureCallback;
        this.f43985e = cameraCaptureResult;
    }

    public final void run() {
        this.f43984d.onCaptureCompleted(this.f43985e);
    }
}
