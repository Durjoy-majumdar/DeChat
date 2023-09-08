package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;

public final /* synthetic */ class FocusMeteringControl$$g implements Camera2CameraControlImpl.CaptureResultListener {

    /* renamed from: a */
    public final /* synthetic */ FocusMeteringControl f44066a;

    /* renamed from: b */
    public final /* synthetic */ boolean f44067b;

    /* renamed from: c */
    public final /* synthetic */ long f44068c;

    public /* synthetic */ FocusMeteringControl$$g(FocusMeteringControl focusMeteringControl, boolean z, long j) {
        this.f44066a = focusMeteringControl;
        this.f44067b = z;
        this.f44068c = j;
    }

    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        return this.f44066a.lambda$executeMeteringAction$2(this.f44067b, this.f44068c, totalCaptureResult);
    }
}
