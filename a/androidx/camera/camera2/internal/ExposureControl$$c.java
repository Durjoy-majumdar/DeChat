package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import p202m2.C117512b;

public final /* synthetic */ class ExposureControl$$c implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ int f44051a;

    /* renamed from: b */
    public final /* synthetic */ C117512b.C117513a f44052b;

    public /* synthetic */ ExposureControl$$c(int i, C117512b.C117513a aVar) {
        this.f44051a = i;
        this.f44052b = aVar;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return ExposureControl.lambda$setExposureCompensationIndex$0(this.f44051a, this.f44052b, totalCaptureResult);
    }
}
