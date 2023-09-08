package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import p202m2.C117512b;

public final /* synthetic */ class Camera2CameraControlImpl$$h implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ long f43971a;

    /* renamed from: b */
    public final /* synthetic */ C117512b.C117513a f43972b;

    public /* synthetic */ Camera2CameraControlImpl$$h(long j, C117512b.C117513a aVar) {
        this.f43971a = j;
        this.f43972b = aVar;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return Camera2CameraControlImpl.lambda$waitForSessionUpdateId$3(this.f43971a, this.f43972b, totalCaptureResult);
    }
}
