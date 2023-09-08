package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import p202m2.C117512b;

public final /* synthetic */ class ImageCapture$$h implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f44242a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.ImageCaptureRequest f44243b;

    public /* synthetic */ ImageCapture$$h(ImageCapture imageCapture, ImageCapture.ImageCaptureRequest imageCaptureRequest) {
        this.f44242a = imageCapture;
        this.f44243b = imageCaptureRequest;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44242a.lambda$takePictureInternal$9(this.f44243b, aVar);
    }
}
