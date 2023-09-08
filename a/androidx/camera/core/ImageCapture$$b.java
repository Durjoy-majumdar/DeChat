package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import p202m2.C117512b;

public final /* synthetic */ class ImageCapture$$b implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C117512b.C117513a f44228a;

    public /* synthetic */ ImageCapture$$b(C117512b.C117513a aVar) {
        this.f44228a = aVar;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ImageCapture.lambda$takePictureInternal$7(this.f44228a, imageReaderProxy);
    }
}
