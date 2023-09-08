package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p1167z8.C112608f;

public final /* synthetic */ class Camera2CapturePipeline$Pipeline$$d implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ Camera2CapturePipeline.Pipeline f44032a;

    /* renamed from: b */
    public final /* synthetic */ List f44033b;

    /* renamed from: c */
    public final /* synthetic */ int f44034c;

    public /* synthetic */ Camera2CapturePipeline$Pipeline$$d(Camera2CapturePipeline.Pipeline pipeline, List list, int i) {
        this.f44032a = pipeline;
        this.f44033b = list;
        this.f44034c = i;
    }

    public final C112608f apply(Object obj) {
        return this.f44032a.lambda$executeCapture$2(this.f44033b, this.f44034c, (TotalCaptureResult) obj);
    }
}
