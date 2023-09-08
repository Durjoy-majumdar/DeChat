package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import java.util.concurrent.Executor;

public final /* synthetic */ class Camera2CameraControlImpl$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControlImpl f43966d;

    /* renamed from: e */
    public final /* synthetic */ Executor f43967e;

    /* renamed from: f */
    public final /* synthetic */ CameraCaptureCallback f43968f;

    public /* synthetic */ Camera2CameraControlImpl$$f(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.f43966d = camera2CameraControlImpl;
        this.f43967e = executor;
        this.f43968f = cameraCaptureCallback;
    }

    public final void run() {
        this.f43966d.lambda$addSessionCameraCaptureCallback$8(this.f43967e, this.f43968f);
    }
}
