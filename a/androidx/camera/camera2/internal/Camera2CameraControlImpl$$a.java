package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;

public final /* synthetic */ class Camera2CameraControlImpl$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControlImpl f43962d;

    /* renamed from: e */
    public final /* synthetic */ CameraCaptureCallback f43963e;

    public /* synthetic */ Camera2CameraControlImpl$$a(Camera2CameraControlImpl camera2CameraControlImpl, CameraCaptureCallback cameraCaptureCallback) {
        this.f43962d = camera2CameraControlImpl;
        this.f43963e = cameraCaptureCallback;
    }

    public final void run() {
        this.f43962d.lambda$removeSessionCameraCaptureCallback$9(this.f43963e);
    }
}
