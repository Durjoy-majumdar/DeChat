package androidx.camera.core;

import androidx.camera.core.ImageCapture;

public final /* synthetic */ class ImageCapture$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageCapture f44245d;

    /* renamed from: e */
    public final /* synthetic */ ImageCapture.OnImageCapturedCallback f44246e;

    public /* synthetic */ ImageCapture$$k(ImageCapture imageCapture, ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        this.f44245d = imageCapture;
        this.f44246e = onImageCapturedCallback;
    }

    public final void run() {
        this.f44245d.lambda$sendImageCaptureRequest$5(this.f44246e);
    }
}
