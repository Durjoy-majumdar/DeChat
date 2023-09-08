package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import java.util.concurrent.Executor;

public final /* synthetic */ class ImageCapture$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageCapture f44233d;

    /* renamed from: e */
    public final /* synthetic */ ImageCapture.OutputFileOptions f44234e;

    /* renamed from: f */
    public final /* synthetic */ Executor f44235f;

    /* renamed from: g */
    public final /* synthetic */ ImageCapture.OnImageSavedCallback f44236g;

    public /* synthetic */ ImageCapture$$e(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, Executor executor, ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        this.f44233d = imageCapture;
        this.f44234e = outputFileOptions;
        this.f44235f = executor;
        this.f44236g = onImageSavedCallback;
    }

    public final void run() {
        this.f44233d.lambda$takePicture$4(this.f44234e, this.f44235f, this.f44236g);
    }
}
