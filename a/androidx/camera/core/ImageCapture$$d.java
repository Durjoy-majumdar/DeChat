package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import java.util.concurrent.Executor;

public final /* synthetic */ class ImageCapture$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageCapture f44230d;

    /* renamed from: e */
    public final /* synthetic */ Executor f44231e;

    /* renamed from: f */
    public final /* synthetic */ ImageCapture.OnImageCapturedCallback f44232f;

    public /* synthetic */ ImageCapture$$d(ImageCapture imageCapture, Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        this.f44230d = imageCapture;
        this.f44231e = executor;
        this.f44232f = onImageCapturedCallback;
    }

    public final void run() {
        this.f44230d.lambda$takePicture$3(this.f44231e, this.f44232f);
    }
}
