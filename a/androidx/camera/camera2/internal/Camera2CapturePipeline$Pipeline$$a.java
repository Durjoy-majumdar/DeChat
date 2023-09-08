package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CaptureConfig;
import p202m2.C117512b;

public final /* synthetic */ class Camera2CapturePipeline$Pipeline$$a implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ Camera2CapturePipeline.Pipeline f44027a;

    /* renamed from: b */
    public final /* synthetic */ CaptureConfig.Builder f44028b;

    public /* synthetic */ Camera2CapturePipeline$Pipeline$$a(Camera2CapturePipeline.Pipeline pipeline, CaptureConfig.Builder builder) {
        this.f44027a = pipeline;
        this.f44028b = builder;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44027a.lambda$submitConfigsInternal$4(this.f44028b, aVar);
    }
}
