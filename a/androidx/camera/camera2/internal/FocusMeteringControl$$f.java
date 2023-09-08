package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;

public final /* synthetic */ class FocusMeteringControl$$f implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ FocusMeteringControl f44063a;

    /* renamed from: b */
    public final /* synthetic */ int f44064b;

    /* renamed from: c */
    public final /* synthetic */ long f44065c;

    public /* synthetic */ FocusMeteringControl$$f(FocusMeteringControl focusMeteringControl, int i, long j) {
        this.f44063a = focusMeteringControl;
        this.f44064b = i;
        this.f44065c = j;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return this.f44063a.lambda$cancelFocusAndMeteringInternal$7(this.f44064b, this.f44065c, totalCaptureResult);
    }
}
