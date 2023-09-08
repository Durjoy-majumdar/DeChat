package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;

public final /* synthetic */ class Camera2CapturePipeline$Pipeline$$f implements Camera2CapturePipeline.ResultListener.Checker {

    /* renamed from: a */
    public final /* synthetic */ Camera2CapturePipeline.Pipeline f44036a;

    public /* synthetic */ Camera2CapturePipeline$Pipeline$$f(Camera2CapturePipeline.Pipeline pipeline) {
        this.f44036a = pipeline;
    }

    public final boolean check(TotalCaptureResult totalCaptureResult) {
        return this.f44036a.is3AConverged(totalCaptureResult);
    }
}
