package androidx.camera.core;

import androidx.camera.core.ImageCapture;

public final /* synthetic */ class ImageCapture$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageCapture.OnImageCapturedCallback f44247d;

    public /* synthetic */ ImageCapture$$l(ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        this.f44247d = onImageCapturedCallback;
    }

    public final void run() {
        this.f44247d.onError(new ImageCaptureException(0, "Request is canceled", (Throwable) null));
    }
}
