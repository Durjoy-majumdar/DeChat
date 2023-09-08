package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ProcessingImageReader;

public final /* synthetic */ class ImageCapture$$i implements ProcessingImageReader.OnProcessingErrorCallback {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture.ImageCaptureRequest f44244a;

    public /* synthetic */ ImageCapture$$i(ImageCapture.ImageCaptureRequest imageCaptureRequest) {
        this.f44244a = imageCaptureRequest;
    }

    public final void notifyProcessingError(String str, Throwable th) {
        ImageCapture.lambda$issueTakePicture$11(this.f44244a, str, th);
    }
}
