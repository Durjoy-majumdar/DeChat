package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import p1167z8.C112608f;

public final /* synthetic */ class Camera2CapturePipeline$Pipeline$$c implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ Camera2CapturePipeline.Pipeline f44031a;

    public /* synthetic */ Camera2CapturePipeline$Pipeline$$c(Camera2CapturePipeline.Pipeline pipeline) {
        this.f44031a = pipeline;
    }

    public final C112608f apply(Object obj) {
        return this.f44031a.lambda$executeCapture$1((Boolean) obj);
    }
}
