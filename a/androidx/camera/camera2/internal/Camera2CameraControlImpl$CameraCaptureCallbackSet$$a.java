package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;

public final /* synthetic */ class Camera2CameraControlImpl$CameraCaptureCallbackSet$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraCaptureCallback f43981d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureFailure f43982e;

    public /* synthetic */ Camera2CameraControlImpl$CameraCaptureCallbackSet$$a(CameraCaptureCallback cameraCaptureCallback, CameraCaptureFailure cameraCaptureFailure) {
        this.f43981d = cameraCaptureCallback;
        this.f43982e = cameraCaptureFailure;
    }

    public final void run() {
        this.f43981d.onCaptureFailed(this.f43982e);
    }
}
