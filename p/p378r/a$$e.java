package p378r;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.interop.Camera2CameraControl;

/* renamed from: r.a$$e */
public final /* synthetic */ class a$$e implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraControl f62796a;

    public /* synthetic */ a$$e(Camera2CameraControl camera2CameraControl) {
        this.f62796a = camera2CameraControl;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return this.f62796a.lambda$new$0(totalCaptureResult);
    }
}
