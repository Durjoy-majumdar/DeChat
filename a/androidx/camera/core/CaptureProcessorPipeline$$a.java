package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;

public final /* synthetic */ class CaptureProcessorPipeline$$a implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ CaptureProcessorPipeline f44200a;

    public /* synthetic */ CaptureProcessorPipeline$$a(CaptureProcessorPipeline captureProcessorPipeline) {
        this.f44200a = captureProcessorPipeline;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        this.f44200a.lambda$onResolutionUpdate$1(imageReaderProxy);
    }
}
