package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;

public final /* synthetic */ class Camera2CameraControlImpl$CameraControlSessionCallback$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraControlImpl.CameraControlSessionCallback f43986d;

    /* renamed from: e */
    public final /* synthetic */ TotalCaptureResult f43987e;

    public /* synthetic */ Camera2CameraControlImpl$CameraControlSessionCallback$$a(Camera2CameraControlImpl.CameraControlSessionCallback cameraControlSessionCallback, TotalCaptureResult totalCaptureResult) {
        this.f43986d = cameraControlSessionCallback;
        this.f43987e = totalCaptureResult;
    }

    public final void run() {
        this.f43986d.lambda$onCaptureCompleted$0(this.f43987e);
    }
}
