package androidx.camera.core;

public final /* synthetic */ class ImageAnalysis$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SafeCloseImageReaderProxy f44205d;

    /* renamed from: e */
    public final /* synthetic */ SafeCloseImageReaderProxy f44206e;

    public /* synthetic */ ImageAnalysis$$a(SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        this.f44205d = safeCloseImageReaderProxy;
        this.f44206e = safeCloseImageReaderProxy2;
    }

    public final void run() {
        ImageAnalysis.lambda$createPipeline$0(this.f44205d, this.f44206e);
    }
}
