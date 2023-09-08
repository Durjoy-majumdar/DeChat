package androidx.camera.core;

public final /* synthetic */ class CaptureProcessorPipeline$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CaptureProcessorPipeline f44202d;

    /* renamed from: e */
    public final /* synthetic */ ImageProxy f44203e;

    public /* synthetic */ CaptureProcessorPipeline$$d(CaptureProcessorPipeline captureProcessorPipeline, ImageProxy imageProxy) {
        this.f44202d = captureProcessorPipeline;
        this.f44203e = imageProxy;
    }

    public final void run() {
        this.f44202d.lambda$onResolutionUpdate$0(this.f44203e);
    }
}
