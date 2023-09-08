package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import p1167z8.C112608f;

public final /* synthetic */ class Camera2CapturePipeline$Pipeline$$b implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ Camera2CapturePipeline.Pipeline f44029a;

    /* renamed from: b */
    public final /* synthetic */ int f44030b;

    public /* synthetic */ Camera2CapturePipeline$Pipeline$$b(Camera2CapturePipeline.Pipeline pipeline, int i) {
        this.f44029a = pipeline;
        this.f44030b = i;
    }

    public final C112608f apply(Object obj) {
        return this.f44029a.lambda$executeCapture$0(this.f44030b, (TotalCaptureResult) obj);
    }
}
