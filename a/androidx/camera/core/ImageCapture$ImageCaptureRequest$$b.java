package androidx.camera.core;

import androidx.camera.core.ImageCapture;

public final /* synthetic */ class ImageCapture$ImageCaptureRequest$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageCapture.ImageCaptureRequest f44253d;

    /* renamed from: e */
    public final /* synthetic */ ImageProxy f44254e;

    public /* synthetic */ ImageCapture$ImageCaptureRequest$$b(ImageCapture.ImageCaptureRequest imageCaptureRequest, ImageProxy imageProxy) {
        this.f44253d = imageCaptureRequest;
        this.f44254e = imageProxy;
    }

    public final void run() {
        this.f44253d.lambda$dispatchImage$0(this.f44254e);
    }
}
