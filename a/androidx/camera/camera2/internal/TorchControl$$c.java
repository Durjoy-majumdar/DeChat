package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;

public final /* synthetic */ class TorchControl$$c implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ TorchControl f44105a;

    public /* synthetic */ TorchControl$$c(TorchControl torchControl) {
        this.f44105a = torchControl;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return this.f44105a.lambda$new$0(totalCaptureResult);
    }
}
